package Encapulation;

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

abstract class Product {
    String name;
    int productId;
    double price;

    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void productInfo() {
        System.out.println(name);
        System.out.println(productId);
        System.out.println(price);
    }
}

class Electronics extends Product implements Taxable {

    public Electronics(String name, int productId, double price) {
        super(name, productId, price);
    }

    public double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public void getTaxDetails() {
        System.out.println("Electronics Tax: 18%");
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(String name, int productId, double price) {
        super(name, productId, price);
    }

    public double calculateDiscount() {
        return price * 0.20;
    }

    public double calculateTax() {
        return price * 0.05;
    }

    public void getTaxDetails() {
        System.out.println("Clothing Tax: 5%");
    }
}

class Groceries extends Product {

    public Groceries(String name, int productId, double price) {
        super(name, productId, price);
    }

    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class Main{
    public static void main(String[] args) {

        Electronics e = new Electronics("Laptop", 1, 50000);
        Clothing c = new Clothing("Shirt", 2, 2000);
        Groceries g = new Groceries("Rice", 3, 1000);

        e.productInfo();
        System.out.println(e.calculateDiscount());
        System.out.println(e.calculateTax());
        e.getTaxDetails();

        c.productInfo();
        System.out.println(c.calculateDiscount());
        System.out.println(c.calculateTax());
        c.getTaxDetails();

        g.productInfo();
        System.out.println(g.calculateDiscount());
    }
}