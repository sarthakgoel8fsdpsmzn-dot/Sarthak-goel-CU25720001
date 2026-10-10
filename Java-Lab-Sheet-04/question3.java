
class Circle {
    double radius;
    static final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculate() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class question3 {
    public static void main(String[] args) {
        double r = 7;

        Circle c = new Circle(r);
        c.calculate();
    }
}
