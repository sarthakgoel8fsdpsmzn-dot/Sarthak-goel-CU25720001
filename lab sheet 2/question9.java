
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        int i = 0;
        int limit = Math.min(first.length(), second.length());

        while (i < limit && first.charAt(i) == second.charAt(i)) {
            i++;
        }

        if (i == limit) {
            if (first.length() == second.length()) {
                System.out.println("Both strings are equal");
            } else if (first.length() < second.length()) {
                System.out.println("First string comes before second");
            } else {
                System.out.println("First string comes after second");
            }
        } else if (first.charAt(i) < second.charAt(i)) {
            System.out.println("First string comes before second");
        } else {
            System.out.println("First string comes after second");
        }

        sc.close();
    }
}