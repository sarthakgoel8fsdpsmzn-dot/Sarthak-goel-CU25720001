
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int count = 0;
            int n = number;

            while (n != 0) {
                count += n & 1;
                n = n >>> 1;
            }

            System.out.println("Number of set bits = " + count);
        }

        sc.close();
    }
}