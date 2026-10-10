
class Factorial {
    static int totalCalls = 0;

    void calculateFactorial(int number) {
        totalCalls++;

        if (number < 0 || number > 20) {
            System.out.println("Enter a number between 0 and 20.");
            return;
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }
}

public class question25 {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.calculateFactorial(5);
        f.calculateFactorial(0);

        System.out.println("Total Calls: " + Factorial.totalCalls);
    }
}
