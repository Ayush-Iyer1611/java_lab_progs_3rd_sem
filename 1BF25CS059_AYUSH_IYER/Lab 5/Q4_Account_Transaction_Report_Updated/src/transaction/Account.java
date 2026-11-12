package transaction;

public class Account {
    int accountNumber;
    double balance;

    // Shared transaction history for all Account objects.
    public static final String[] transactionHistory = new String[100];
    public static int transactionCount = 0;

    public Account(int no, double bal) {
        accountNumber = no;
        balance = bal;
        recordTransaction("Account opened with balance: " + bal);
    }

    private void recordTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount] = transaction;
            transactionCount++;
        } else {
            System.out.println("Transaction history is full. Transaction not recorded.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            recordTransaction("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance = balance - amount;
            recordTransaction("Withdrawn: " + amount + " | Balance: " + balance);
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
            recordTransaction("Failed withdrawal: " + amount + " | Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
