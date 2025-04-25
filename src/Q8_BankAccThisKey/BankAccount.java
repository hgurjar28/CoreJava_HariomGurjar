package Q8_BankAccThisKey;

public class BankAccount {
    String name;
    double balance;
    String type;

    // Constructor using 'this' to fix variable shadowing
    public BankAccount(String name, double balance, String type) {
        this.name = name;       // 'this' refers to the class variable
        this.balance = balance;
        this.type = type;
    }

    // Method to update the balance
    public void updateBalance(double amount) {
        this.balance += amount; // 'this.balance' ensures the class field is updated
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Type: " + this.type);
        System.out.println("Balance: ₹" + this.balance);
    }
}
