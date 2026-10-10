
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 integers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == search) {
                        System.out.println(
                            "Found at position: Layer " + (i + 1)
                            + ", Row " + (j + 1)
                            + ", Column " + (k + 1)
                        );
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
