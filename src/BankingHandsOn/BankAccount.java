package BankingHandsOn;

 public abstract class BankAccount {

    protected String accountHolderName;
    protected  double balance;
    protected  String accountNumber;

//    Constructor chaining
    public BankAccount(String accountHolderName , double balance , String accountNumber){

        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;

    }


         // Abstract method
         public abstract void accountType();


        public void  displayDetails(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println("Account Number: "+accountNumber);
    }


// Method to check balance
    public void checkBalance() {
    System.out.println("Current Balance: " + balance);
}



}
