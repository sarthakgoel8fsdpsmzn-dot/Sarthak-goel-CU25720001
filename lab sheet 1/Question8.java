
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("Please enter an English alphabet.");
        }

        sc.close();
    }
}