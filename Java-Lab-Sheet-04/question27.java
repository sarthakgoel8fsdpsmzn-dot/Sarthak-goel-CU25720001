
class StringReverse {
    static int totalReversals = 0;

    void reverse(String text) {
        String original = text;
        String reversed = "";

        totalReversals++;

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

public class question27 {
    public static void main(String[] args) {
        StringReverse s = new StringReverse();

        s.reverse("Java");
        s.reverse("Hello");

        System.out.println("Total Reversals: " + StringReverse.totalReversals);
    }
}
