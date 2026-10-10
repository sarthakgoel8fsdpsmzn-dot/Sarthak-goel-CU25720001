
class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b;
        operationsCount++;
        System.out.println("Addition: " + result);
    }

    void subtract(double a, double b) {
        double result = a - b;
        operationsCount++;
        System.out.println("Subtraction: " + result);
    }

    void multiply(double a, double b) {
        double result = a * b;
        operationsCount++;
        System.out.println("Multiplication: " + result);
    }

    void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            operationsCount++;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class question11 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(10, 5);
        c.subtract(10, 5);
        c.multiply(10, 5);
        c.divide(10, 5);

        System.out.println("Total operations: "
                + Calculator.operationsCount);
    }
}
