
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d)
                           : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d)
                           : ((c < d) ? c : d));

        System.out.println("Smallest number = " + smallest);

        sc.close();
    }
}