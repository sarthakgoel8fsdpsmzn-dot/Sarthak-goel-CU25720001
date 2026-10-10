
import java.util.Arrays;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print(
                "Enter number of elements in row " + (i + 1) + ": "
            );

            int size = sc.nextInt();
            arr[i] = new int[size];

            System.out.println("Enter row elements:");

            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
