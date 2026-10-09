
public class Question4 {
    public static void main(String[] args) {
        int visitors = 0;

        System.out.println("Initial visitors: " + visitors);

        System.out.println("Visitor entering: " + ++visitors);
        System.out.println("Visitor entering: " + visitors++);

        System.out.println("Visitors after entry: " + visitors);

        System.out.println("Visitor leaving: " + visitors--);
        System.out.println("Visitors after leaving: " + visitors);
    }
}