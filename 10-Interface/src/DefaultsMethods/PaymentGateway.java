package DefaultsMethods;
interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund: " + amount);
    }
}

class UPI implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}
