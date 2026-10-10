
class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void display() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Wheels: " + wheels);
    }
}

public class question6 {
    public static void main(String[] args) {
        String brand = "Toyota";
        double mileage = 18.5;

        Car c = new Car(brand, mileage);
        c.display();
    }
}
