package Pro_10_Bank_Transaction;

import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private String type;
    private LocalDateTime timestamp;

    public Transaction(double amount, String type, LocalDateTime timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }


    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return type + " of $" + amount + " at " + timestamp;
    }
}

