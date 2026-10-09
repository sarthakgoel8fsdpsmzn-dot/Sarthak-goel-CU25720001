
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int rotated = Integer.rotateLeft(number, 2);

        System.out.println("Original number = " + number);
        System.out.println("After left rotation by 2 bits = " + rotated);

        sc.close();
    }
}