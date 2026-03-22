package Interface.Defining;


interface Rental {
    void rent();
    void returnVehicle();
}

class Car implements Rental {
    public void rent() {
        System.out.println("Car Rented");
    }

    public void returnVehicle() {
        System.out.println("Car Returned");
    }
}

class Bike implements Rental {
    public void rent() {
        System.out.println("Bike Rented");
    }

    public void returnVehicle() {
        System.out.println("Bike Returned");
    }
}

class Bus implements Rental {
    public void rent() {
        System.out.println("Bus Rented");
    }

    public void returnVehicle() {
        System.out.println("Bus Returned");
    }
}

public class MultiVeichle{
    public static void main(String[] args) {
        Rental r1 = new Car();
        Rental r2 = new Bike();
        Rental r3 = new Bus();

        r1.rent(); r1.returnVehicle();
        r2.rent(); r2.returnVehicle();
        r3.rent(); r3.returnVehicle();
    }
}