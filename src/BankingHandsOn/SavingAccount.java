package BankingHandsOn;

public class SavingAccount extends BankAccount implements Transaction{

//    Constructor chaining
    public SavingAccount(String accountHolderName , double balance ,String accountNumber){
        super(accountHolderName,balance,accountNumber);
    }

//    overriding abstract method
    @Override
    public void accountType() {
        System.out.println("This is a Savings Account.");
    }

     // implementing deposit method
    @Override
    public void deposit(double amount) {

        if (amount>=0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else {
            System.out.println("Enter correct amount");
        }
    }

     // implementing withdraw method
     @Override
     public void withdraw(double amount) {
         if (balance >= amount) {
             balance -= amount;
             System.out.println("Withdraw: " + amount);
             System.out.println("Current Balance: " + balance);
         } else {
             System.out.println("Insufficient funds.");
         }
     }
}
