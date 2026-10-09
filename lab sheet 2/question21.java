
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;

            do {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= number);
        }

        sc.close();
    }
}