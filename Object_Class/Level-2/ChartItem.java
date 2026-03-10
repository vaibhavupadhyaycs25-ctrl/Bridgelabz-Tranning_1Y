class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {

        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
    }

    void totalCost() {

        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        CartItem cart = new CartItem();

        cart.addItem("Shoes", 1500, 2);
        cart.totalCost();
    }
}