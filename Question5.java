
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        int convertedNumber = (int) number;

        System.out.println("Original number: " + number);
        System.out.println("Converted integer: " + convertedNumber);

        sc.close();
    }
}