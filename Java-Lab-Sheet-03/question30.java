
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int zeros = 0;
        int nonZeros = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }

        System.out.println("Zero elements = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);

        if (zeros > nonZeros) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }

        sc.close();
    }
}
