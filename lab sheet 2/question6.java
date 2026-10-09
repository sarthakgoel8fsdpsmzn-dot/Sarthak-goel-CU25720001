
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double number = sc.nextDouble();

        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Number after reduction = " + number);
        System.out.println("Total steps = " + steps);

        sc.close();
    }
}