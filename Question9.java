
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1 (out of 100): ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2 (out of 100): ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3 (out of 100): ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = (total / 300) * 100;

        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}