
//Simulate a simple in-memory bank transfer system where moving funds
//between accounts must rollback if an exception occurs mid-operation (e.g.invalid target account).
//Use try-catch to ensure that no partial transfer leaves accounts in an
//inconsistent state.


package ExceptionHandlingExercise.Q_5_PartialTransactionRollback;

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}


class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws BankException {
        if (amount > balance) {
            throw new BankException("Not enough balance");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class TransactionRollback {


    public static void transfer(Account fromAccount, Account toAccount, double amount) {

        double originalFromBalance = fromAccount.getBalance();
        double originalToBalance = toAccount != null ? toAccount.getBalance() : 0;

        try {

            fromAccount.withdraw(amount);


            if (toAccount == null) {
                throw new BankException("Invalid target account");
            }


            toAccount.deposit(amount);
            System.out.println("Transfer successful: " + amount + " transferred.");
        } catch (BankException e) {
            fromAccount.deposit(amount);
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Account account1 = new Account("12345", 1000);
        Account account2 = new Account("67890", 500);

        System.out.println("Before transfer:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        transfer(account1, null, 200);

        System.out.println("\nAfter transfer attempt:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
