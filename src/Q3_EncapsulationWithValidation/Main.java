package Q3_EncapsulationWithValidation;

public class Main {
    public static void main(String[] args) {

        // Create an instance of BankAccountManager to manage the bank account
        BankAccountManager manager = new BankAccountManager();
        manager.createAccount();
        manager.transaction();

    }
}