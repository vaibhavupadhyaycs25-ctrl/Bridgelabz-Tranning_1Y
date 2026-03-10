class Item {

    int itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void totalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        Item item = new Item();

        item.itemCode = 101;
        item.itemName = "Laptop";
        item.price = 50000;

        item.displayItem();
        item.totalCost(2);
    }
}]]