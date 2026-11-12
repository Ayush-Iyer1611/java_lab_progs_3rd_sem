import transaction.Account;
import reports.TransactionReport;

public class Main {
    public static void main(String[] args) {

        Account a = new Account(101, 5000);

        a.deposit(2000);
        a.withdraw(1000);
        a.withdraw(10000);

        TransactionReport r = new TransactionReport();
        r.generateReport(a);
    }
}
