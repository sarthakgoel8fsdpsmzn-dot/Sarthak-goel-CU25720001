
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double interest = amount - principal;

        System.out.println("Compound Interest = " + interest);
        System.out.println("Total Amount = " + amount);

        sc.close();
    }
}