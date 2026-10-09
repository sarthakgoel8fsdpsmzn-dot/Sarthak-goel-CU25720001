
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int temp = number;

        while (temp % 4 == 0) {
            temp = temp >> 2;
        }

        if (temp == 1) {
            System.out.println("It is a power of 4.");
        } else {
            System.out.println("It is not a power of 4.");
        }

        int toggled = number ^ (1 << 2);
        System.out.println("After toggling the 3rd bit: " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 50; i++) {
            int result = number * i;

            if (result % 48 == 0) {
                System.out.println("Reached multiple of 48: " + result);
                break;
            }

            if (result % 6 == 0) {
                continue;
            }

            System.out.println(number + " x " + i + " = " + result);
        }

        sc.close();
    }
}