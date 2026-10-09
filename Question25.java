
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (&, |, !): ");
        char operator = sc.next().charAt(0);

        boolean x = (a != 0);
        boolean y = (b != 0);

        if (operator == '&') {
            System.out.println("Result: " + (x && y));
        } else if (operator == '|') {
            System.out.println("Result: " + (x || y));
        } else if (operator == '!') {
            System.out.println("Result: " + (!x));
        } else {
            System.out.println("Invalid operator.");
        }

        sc.close();
    }
}