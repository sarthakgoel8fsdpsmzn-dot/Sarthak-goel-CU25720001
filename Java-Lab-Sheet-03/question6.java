
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array elements:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }

        sc.close();
    }
}
