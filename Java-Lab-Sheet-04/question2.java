
class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        double area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }
}

public class question2 {
    public static void main(String[] args) {
        double l = 10;
        double b = 5;

        Rectangle r = new Rectangle(l, b);
        r.displayArea();
    }
}
