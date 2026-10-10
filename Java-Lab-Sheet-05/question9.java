
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
        e.stop();
    }
}
