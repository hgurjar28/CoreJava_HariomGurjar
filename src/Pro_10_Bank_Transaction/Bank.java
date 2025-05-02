package Pro_10_Bank_Transaction;

import java.util.*;

public class Bank {
    private Map<String, List<Transaction>> transactionLog = new HashMap<>();;



    public void addTransaction(String accountNumber, Transaction transaction) {
        transactionLog.computeIfAbsent(accountNumber, k -> new ArrayList<>()).add(transaction);
    }

    public void printStatement(String accountNumber) {
        List<Transaction> transactions = transactionLog.get(accountNumber);
        if (transactions == null || transactions.isEmpty()) {
            System.out.println("No transactions for account " + accountNumber);
            return;
        }

        transactions.sort(Comparator.comparing(Transaction::getTimestamp));
        System.out.println("Statement for account " + accountNumber + ":");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
