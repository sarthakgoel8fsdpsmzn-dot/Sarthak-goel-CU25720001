
class Temperature {
    double celsius;
    static String scale = "Celsius";

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Scale: " + scale);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}

public class question13 {
    public static void main(String[] args) {
        double temp = 25;

        Temperature t = new Temperature(temp);
        t.convert();
    }
}
