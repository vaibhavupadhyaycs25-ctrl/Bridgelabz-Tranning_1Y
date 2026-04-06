package Thrads;
class BankAccount implements Runnable {

    private String name;
    private String accountType;

    public BankAccount(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                        name + " (" + accountType + ") is checking balance. " +
                                "Thread: " + Thread.currentThread().getName() +
                                " | Priority: " + Thread.currentThread().getPriority()
                );
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Vaibhav", "Premium");
        BankAccount user2 = new BankAccount("Rahul", "Regular");
        BankAccount user3 = new BankAccount("Aman", "Basic");

        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);
        Thread t3 = new Thread(user3);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}