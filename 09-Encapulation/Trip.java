package Encapulation;

interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

abstract class Ride {
    private int rideId;
    private String driverName;
    private double ratePerKm;

    public Ride(int rideId, String driverName, double ratePerKm) {
        this.rideId = rideId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getRideId() {
        return rideId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getRideDetails() {
        System.out.println(rideId);
        System.out.println(driverName);
        System.out.println(ratePerKm);
    }
}

class Cars extends Ride implements GPS {
    private String location;

    public Cars(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Car Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Ride implements GPS {
    private String location;

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    public void getCurrentLocation() {
        System.out.println("Bike Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Autos extends Ride implements GPS {
    private String location;

    public Autos(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }

    public void getCurrentLocation() {
        System.out.println("Auto Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class Trip {
    public static void main(String[] args) {

        Ride r1 = new Cars(1, "Rahul", 15);
        Ride r2 = new Bike(2, "Aman", 10);
        Ride r3 = new Autos(3, "Rohit", 12);

        Ride[] rides = {r1, r2, r3};

        for (Ride r : rides) {
            r.getRideDetails();

            double fare = r.calculateFare(10);
            System.out.println("Fare: " + fare);

            GPS g = (GPS) r;
            g.updateLocation("City Center");
            g.getCurrentLocation();

            System.out.println();
        }
    }
}