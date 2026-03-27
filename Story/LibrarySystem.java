package Story;
class Book {
    int bookId;
    String title;
    double price;

    static String libraryName = "GLA Library";

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method (will be overridden)
    double calculateFine(int daysLate) {
        return 0;
    }
}

// Child Class 1
class TextBook extends Book {

    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

// Child Class 2
class Magazine extends Book {

    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        // Polymorphism (Parent reference)
        Book b1 = new TextBook(1, "Java Basics", 500);
        Book b2 = new Magazine(2, "Tech Monthly", 200);

        int daysLate = 3;

        System.out.println("Library: " + Book.libraryName);

        System.out.println("TextBook Fine: ₹" + b1.calculateFine(daysLate));
        System.out.println("Magazine Fine: ₹" + b2.calculateFine(daysLate));
    }
}