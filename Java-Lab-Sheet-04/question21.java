
class Palindrome {
    static int countChecks = 0;

    void checkNumber(int number) {
        int original = number;
        int reverse = 0;
        int digit;

        countChecks++;

        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original >= 0 && original == reverse) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}

public class question21 {
    public static void main(String[] args) {
        int number = 121;

        Palindrome p = new Palindrome();
        p.checkNumber(number);
        p.checkNumber(123);

        System.out.println("Total Checks: " + Palindrome.countChecks);
    }
}
