class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance = 5000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}