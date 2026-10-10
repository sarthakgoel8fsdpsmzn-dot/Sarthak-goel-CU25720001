
class Fibonacci {
    static int seriesCount = 0;

    void displaySeries(int n) {
        seriesCount++;

        if (n <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}

public class question24 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        f.displaySeries(10);

        System.out.println("Total Series Calls: " + Fibonacci.seriesCount);
    }
}
