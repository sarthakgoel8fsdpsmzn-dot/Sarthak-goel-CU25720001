
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print(
                "Enter number of subjects for student " + (i + 1) + ": "
            );

            int subjects = sc.nextInt();
            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nStudent Marks:");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
