
package Encapulation;

public class FoodDelivery {

    interface Discountable {
        double applyDiscount();
        void getDiscountDetails();
    }

    static abstract class FoodItem {
        private String itemName;
        private double price;
        private int quantity;

        public FoodItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public abstract double calculateTotalPrice();

        public void getItemDetails() {
            System.out.println(itemName);
            System.out.println(price);
            System.out.println(quantity);
        }
    }

    static class VegItem extends FoodItem implements Discountable {

        public VegItem(String name, double price, int quantity) {
            super(name, price, quantity);
        }

        public double calculateTotalPrice() {
            return getPrice() * getQuantity();
        }

        public double applyDiscount() {
            return calculateTotalPrice() * 0.10;
        }

        public void getDiscountDetails() {
            System.out.println("Veg Discount: 10%");
        }
    }

    static class NonVegItem extends FoodItem implements Discountable {

        public NonVegItem(String name, double price, int quantity) {
            super(name, price, quantity);
        }

        public double calculateTotalPrice() {
            return (getPrice() * getQuantity()) + 50;
        }

        public double applyDiscount() {
            return calculateTotalPrice() * 0.05;
        }

        public void getDiscountDetails() {
            System.out.println("Non-Veg Discount: 5%");
        }
    }

    public static class Main {
        public static void main(String[] args) {

            FoodItem f1 = new VegItem("Paneer", 200, 2);
            FoodItem f2 = new NonVegItem("Chicken", 300, 2);

            FoodItem[] items = {f1, f2};

            for (FoodItem f : items) {
                f.getItemDetails();

                double total = f.calculateTotalPrice();
                System.out.println("Total Price: " + total);

                Discountable d = (Discountable) f;
                double discount = d.applyDiscount();
                System.out.println("Discount: " + discount);
                d.getDiscountDetails();

                System.out.println("Final Price: " + (total - discount));
                System.out.println();
            }
        }
    }
}

