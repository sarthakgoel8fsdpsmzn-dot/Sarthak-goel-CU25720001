
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter range start year: ");
        int start = sc.nextInt();

        System.out.print("Enter range end year: ");
        int end = sc.nextInt();

        boolean leapYear =
                (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);

        if (start <= end && leapYear
                && year >= start && year <= end) {
            System.out.println("Year is a leap year and within range");
        } else {
            System.out.println("Condition not satisfied");
        }

        sc.close();
    }
}