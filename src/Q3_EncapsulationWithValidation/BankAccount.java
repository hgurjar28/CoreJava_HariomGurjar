package Q3_EncapsulationWithValidation;

class BankAccount {

    private String accountHolder;
    private double balance;
    private String accountNumber;


    // Constructor to initialize bank account
    public BankAccount(String accountHolder, double initialBalance, String accountNumber) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be nagative");
            this.balance = 0;
        }
    }

    //    Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw :" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}