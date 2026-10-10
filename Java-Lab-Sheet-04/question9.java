
class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    Laptop(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
    }

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + os);
    }
}

public class question9 {
    public static void main(String[] args) {
        String brand = "HP";
        int ram = 16;

        Laptop l = new Laptop(brand, ram);
        l.display();
    }
}
