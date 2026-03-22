package DefaultsMethods;
interface Dashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class ElectricCar implements Dashboard {
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}