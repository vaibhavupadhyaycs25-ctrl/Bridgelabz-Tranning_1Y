package Encapulation;



interface GPSS {
    void getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId);
        System.out.println(driverName);
        System.out.println(ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(int id, String driver, double rate) {
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

class Bikes extends Vehicle implements GPS {
    private String location;

    public Bikes(int id, String driver, double rate) {
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

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(int id, String driver, double rate) {
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

public class Veichle{
    public static void main(String[] args) {

        Vehicle v1 = new Car(1, "Rahul", 15);
        Vehicle v2 = new Bikes(2, "Aman", 10);
        Vehicle v3 = new Auto(3, "Rohit", 12);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();

            double fare = v.calculateFare(10);
            System.out.println("Fare: " + fare);

            GPS g = (GPS) v;
            g.updateLocation("City Center");
            g.getCurrentLocation();

            System.out.println();
        }
    }
}