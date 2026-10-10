
class BankAccount {
    double balance;
    static String bankCode = "SBI001";

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Withdrawn: Rs. " + withdrawalAmount);
            System.out.println("Remaining Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

public class question20 {
    public static void main(String[] args) {
        double initialBalance = 5000;
        double amount = 2000;

        BankAccount account = new BankAccount(initialBalance);
        System.out.println("Bank Code: " + BankAccount.bankCode);
        account.withdraw(amount);
    }
}
