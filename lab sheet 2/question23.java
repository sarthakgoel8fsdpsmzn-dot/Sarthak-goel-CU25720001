
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Not a palindrome");
        } else {
            int original = number;
            int temp = number;
            long reverse = 0;

            while (temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            if (original == reverse) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not a palindrome");
            }
        }

        sc.close();
    }
}