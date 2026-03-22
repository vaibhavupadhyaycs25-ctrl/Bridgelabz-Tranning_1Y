package Encapulation;
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(itemId);
        System.out.println(title);
        System.out.println(author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book Reserved");
        } else {
            System.out.println("Book Not Available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine Reserved");
        } else {
            System.out.println("Magazine Not Available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD Reserved");
        } else {
            System.out.println("DVD Not Available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class Library{
    public static void main(String[] args) {

        LibraryItem i1 = new Book(1, "Java", "James Gosling");
        LibraryItem i2 = new Magazine(2, "Tech Today", "Editor");
        LibraryItem i3 = new DVD(3, "Inception", "Nolan");

        LibraryItem[] items = {i1, i2, i3};

        for (LibraryItem item : items) {
            item.getItemDetails();

            System.out.println("Loan Duration: " + item.getLoanDuration());

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem();

            System.out.println();
        }
    }
}