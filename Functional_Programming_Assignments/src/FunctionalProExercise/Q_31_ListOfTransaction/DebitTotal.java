
//Given a list of transactions (with amount and type), calculate the total amount for type "DEBIT" using streams.
package FunctionalProExercise.Q_31_ListOfTransaction;
import java.util.Arrays;
import java.util.List;

public class DebitTotal {

    static class Transaction {
        String type;
        double amount;

        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        List<Transaction> txs = Arrays.asList(
                new Transaction("DEBIT", 100),
                new Transaction("CREDIT", 50),
                new Transaction("DEBIT", 200)
        );

        double totalDebit = txs.stream()
                .filter(t -> t.type.equals("DEBIT"))
                .mapToDouble(t -> t.amount)
                .sum();

        System.out.println("Total DEBIT: " + totalDebit);
    }
}
