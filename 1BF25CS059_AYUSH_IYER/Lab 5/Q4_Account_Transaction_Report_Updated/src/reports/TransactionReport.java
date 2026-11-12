package reports;

import transaction.Account;
import java.util.Arrays;

public class TransactionReport {

    public void generateReport(Account a) {
        System.out.println("\n--- Transaction Report ---");
        a.display();

        System.out.println("\n--- Transaction History Array ---");
        String[] history = Arrays.copyOf(
            Account.transactionHistory,
            Account.transactionCount
        );

        System.out.println(Arrays.toString(history));
    }
}
