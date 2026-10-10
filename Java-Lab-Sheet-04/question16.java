
class Triangle {
    double a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void checkTriangle() {
        double side1 = a;
        double side2 = b;
        double side3 = c;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
            side1 + side2 <= side3 ||
            side1 + side3 <= side2 ||
            side2 + side3 <= side1) {
            System.out.println("Invalid Triangle");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 ||
                   side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}

public class question16 {
    public static void main(String[] args) {
        double a = 5, b = 5, c = 5;

        Triangle t = new Triangle(a, b, c);
        t.checkTriangle();
    }
}
