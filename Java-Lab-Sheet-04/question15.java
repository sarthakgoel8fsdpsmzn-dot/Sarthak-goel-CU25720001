
class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "State Bank";

    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + principal);
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
    }
}

public class question15 {
    public static void main(String[] args) {
        double p = 10000;
        double r = 5;
        double t = 2;

        SimpleInterest si = new SimpleInterest(p, r, t);
        si.calculateInterest();
    }
}
