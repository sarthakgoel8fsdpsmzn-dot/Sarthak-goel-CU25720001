
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least 2 elements are required.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = 0;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                found = true;
            } else if (arr[i] < largest) {
                if (!found || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Second largest distinct element = "
                    + secondLargest);
        } else {
            System.out.println("No second largest distinct element exists.");
        }

        sc.close();
    }
}
