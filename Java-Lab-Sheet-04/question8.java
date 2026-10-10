
class Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void display() {
        String penColor = color;
        String penType = type;

        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

public class question8 {
    public static void main(String[] args) {
        String color = "Blue";
        String type = "Ball Pen";

        Pen p = new Pen(color, type);
        p.display();
    }
}
