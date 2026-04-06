package Thrads;

class Order implements Runnable {

    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.println("Order " + orderId + " from " + restaurant +
                    " picked up by " + Thread.currentThread().getName());

            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + orderId + " is in transit by " +
                    Thread.currentThread().getName());

            Thread.sleep(deliveryTime * 1000);

            long end = System.currentTimeMillis();

            System.out.println("Order " + orderId + " delivered by " +
                    Thread.currentThread().getName() +
                    " | Total Time: " + (end - start) + " ms");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {

        Thread o1 = new Thread(new Order(101, "Dominos", 2), "Agent-1");
        Thread o2 = new Thread(new Order(102, "KFC", 3), "Agent-2");
        Thread o3 = new Thread(new Order(103, "McDonalds", 1), "Agent-3");
        Thread o4 = new Thread(new Order(104, "PizzaHut", 4), "Agent-4");
        Thread o5 = new Thread(new Order(105, "BurgerKing", 2), "Agent-5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(5);
        o5.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}