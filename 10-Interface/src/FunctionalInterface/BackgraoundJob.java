package FunctionalInterface;
public class BackgraoundJob{
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Task Running...");
        };

        Thread t = new Thread(task);
        t.start();
    }
}
