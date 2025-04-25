package Q8_BankAccThisKey;

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Rahul Mehta", 5000, "Savings");


        account.displayDetails();


        account.updateBalance(1000);
        System.out.println("\nAfter deposit:");
        account.displayDetails();


        account.updateBalance(-500);
        System.out.println("\nAfter withdrawal:");
        account.displayDetails();
    }
}
