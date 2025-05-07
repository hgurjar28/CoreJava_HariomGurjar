package MultiThreading.BankAccount;

public class BankAccountSynchronization {


    static class BankAccount {
        private double balance;
        private final String accountId;
        private final Object lock;
        private final StringBuilder transactionLog;

        public BankAccount(String accountId, double initialBalance) {
            this.accountId = accountId;
            this.balance = initialBalance;
            this.lock = new Object();
            this.transactionLog = new StringBuilder();
            log("Account created with balance: " + initialBalance);
        }


        public void deposit(double amount) {
            synchronized (lock) {
                balance += amount;
                log("Deposited: " + amount + ", New Balance: " + balance);
            }
        }


        public void withdraw(double amount) {
            synchronized (lock) {
                if (balance >= amount) {
                    balance -= amount;
                    log("Withdrew: " + amount + ", New Balance: " + balance);
                } else {
                    log("Failed Withdrawal: " + amount + " (Insufficient Funds)");
                }
            }
        }

        private void log(String message) {
            synchronized (transactionLog) {
                transactionLog.append("[")
                        .append(Thread.currentThread().getName())
                        .append("] ")
                        .append(message)
                        .append("\n");
            }
        }


        public double getBalance() {
            synchronized (lock) {
                return balance;
            }
        }


        public void printTransactionLog() {
            System.out.println("Transaction log for account: " + accountId);
            System.out.println(transactionLog.toString());
        }
    }


    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC123", 1000);


        Thread user1 = new Thread(() -> {
            account.deposit(200);
            account.withdraw(100);
            account.withdraw(500);
        }, "User-1");

        Thread user2 = new Thread(() -> {
            account.withdraw(300);
            account.deposit(150);
            account.withdraw(200);
        }, "User-2");

        Thread user3 = new Thread(() -> {
            account.deposit(400);
            account.withdraw(250);
        }, "User-3");


        user1.start();
        user2.start();
        user3.start();


        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final Balance: " + account.getBalance());
        account.printTransactionLog();
    }
}

