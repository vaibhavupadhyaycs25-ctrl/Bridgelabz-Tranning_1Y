class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double p) {

        movieName = name;
        seatNumber = seat;
        price = p;
    }

    void displayTicket() {

        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket t = new MovieTicket();

        t.bookTicket("Avengers", 12, 250);
        t.displayTicket();
    }
