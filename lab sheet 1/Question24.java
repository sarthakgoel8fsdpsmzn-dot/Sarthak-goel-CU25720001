
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (number > 1 && sum == number) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }

        sc.close();
    }
}