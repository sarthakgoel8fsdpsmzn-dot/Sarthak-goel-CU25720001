
class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean isPrime = true;
        totalPrimeChecks++;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}

public class question23 {
    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        p.checkPrime(7);
        p.checkPrime(10);

        System.out.println("Total Checks: " + PrimeChecker.totalPrimeChecks);
    }
}
