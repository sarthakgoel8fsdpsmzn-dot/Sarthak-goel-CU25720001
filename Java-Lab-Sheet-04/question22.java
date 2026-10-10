
class Armstrong {
    static int totalChecks = 0;

    void checkNumber(int number) {
        int original = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        totalChecks++;

        if (number < 0) {
            System.out.println("Not an Armstrong Number.");
            return;
        }

        do {
            digits++;
            temp /= 10;
        } while (temp > 0);

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
}

public class question22 {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();

        a.checkNumber(153);
        a.checkNumber(123);

        System.out.println("Total Checks: " + Armstrong.totalChecks);
    }
}
