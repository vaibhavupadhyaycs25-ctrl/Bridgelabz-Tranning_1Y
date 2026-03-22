package Encapulation;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println(balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

public class Banking {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("ACC101", "Rahul", 50000);
        BankAccount a2 = new CurrentAccount("ACC102", "Aman", 30000);

        BankAccount[] accounts = {a1, a2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            acc.deposit(5000);
            acc.withdraw(2000);

            System.out.println("Interest: " + acc.calculateInterest());

            Loanable l = (Loanable) acc;
            System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
            l.applyForLoan(10000);

            System.out.println();
        }
    }
}