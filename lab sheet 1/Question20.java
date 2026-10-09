
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(
            sc.next().charAt(0)
        );

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            if (gender == 'M') {
                if (age >= 21) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not eligible");
                }
            } else if (gender == 'F') {
                if (age >= 18) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not eligible");
                }
            } else {
                System.out.println("Invalid gender");
            }
        }

        sc.close();
    }
}