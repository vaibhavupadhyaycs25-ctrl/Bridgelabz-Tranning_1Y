package Thrads;

class Device implements Runnable {

    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                long time = System.currentTimeMillis();
                System.out.println(
                        name + " running at " + time +
                                " | Thread: " + Thread.currentThread().getName() +
                                " | Priority: " + Thread.currentThread().getPriority()
                );
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {

        Thread security = new Thread(new Device("Security Camera", 3000));
        Thread temperature = new Thread(new Device("Temperature Sensor", 5000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock Monitor", 6000));

        security.setPriority(10);
        temperature.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        security.start();
        temperature.start();
        light.start();
        door.start();
    }
}