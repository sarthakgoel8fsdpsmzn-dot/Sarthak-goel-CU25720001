
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double height = sc.nextDouble();

        if (height < 150) {
            System.out.println("Short");
        } else if (height <= 170) {
            System.out.println("Average");
        } else {
            System.out.println("Tall");
        }

        sc.close();
    }
}