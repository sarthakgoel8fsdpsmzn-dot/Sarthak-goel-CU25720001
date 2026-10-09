
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (Character.isLetter(ch))
                ? ("aeiouAEIOU".indexOf(ch) >= 0
                    ? "Vowel" : "Consonant")
                : (Character.isDigit(ch)
                    ? "Digit" : "Special Symbol");

        System.out.println("Character type = " + result);

        sc.close();
    }
}