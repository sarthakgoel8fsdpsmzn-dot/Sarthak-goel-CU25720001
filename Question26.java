
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        if (number >= 10000 && number <= 99999) {
            int firstDigit = number / 10000;
            int lastDigit = number % 10;

            if (firstDigit == lastDigit) {
                System.out.println(
                        "First and last digits are equal.");
            } else {
                System.out.println(
                        "First and last digits are not equal.");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        sc.close();
    }
}