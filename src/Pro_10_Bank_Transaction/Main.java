
//Problem 10: Bank Transaction Log (Map, List)
//        Track transactions using Map<String, List<Transaction>> keyed by account number.
//        •	Generate statements, sort by transaction time.


package Pro_10_Bank_Transaction;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addTransaction("ACC123", new Transaction(500, "deposit", LocalDateTime.of(2025, 4, 28, 10, 15)));
        bank.addTransaction("ACC123", new Transaction(200, "withdrawal", LocalDateTime.of(2025, 4, 29, 14, 30)));
        bank.addTransaction("ACC123", new Transaction(300, "deposit", LocalDateTime.of(2025, 4, 27, 9, 0)));

        bank.addTransaction("ACC456", new Transaction(1000, "deposit", LocalDateTime.now()));

        bank.printStatement("ACC123");
        System.out.println();
        bank.printStatement("ACC456");
    }
}
