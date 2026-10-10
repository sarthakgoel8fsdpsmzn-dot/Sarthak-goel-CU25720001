
class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;
        double newBalance = balance + depositAmount;
        balance = newBalance;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class question7 {
    public static void main(String[] args) {
        int accNo = 1001;
        double initialBalance = 5000;

        BankAccount account = new BankAccount(accNo, initialBalance);
        account.deposit(1500);
        account.display();
    }
}
