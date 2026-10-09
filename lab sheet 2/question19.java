
public class Question19 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            int original = number;
            int temp = number;
            int digits = 0;
            int sum = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(number + " ");
            }
        }
    }
}