
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        if (power < 0 || power > 30) {
            System.out.println("Enter a power between 0 and 30.");
        } else {
            int multiplied = number << power;
            int divided = number >> power;

            System.out.println("After multiplication = " + multiplied);
            System.out.println("After division = " + divided);
        }

        sc.close();
    }
}