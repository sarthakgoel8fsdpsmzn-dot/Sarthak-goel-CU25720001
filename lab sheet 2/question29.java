
import java.util.Random;

public class Question29 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int count = 0;

        do {
            number = random.nextInt(100) + 1;
            System.out.println("Generated number: " + number);
            count++;

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found the required number: " + number);
                break;
            }
        } while (true);

        System.out.println("Numbers generated: " + count);
    }
}