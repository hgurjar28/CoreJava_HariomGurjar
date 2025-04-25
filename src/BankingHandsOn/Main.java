package BankingHandsOn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.print("choose Account type:1 for Saving Account , 2 for Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter your Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); //Consume new line
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();


        if (choice == 1) {
            account = new SavingAccount(accountHolderName, balance, accountNumber);
        } else if (choice == 2) {
            account = new CurrentAccount(accountHolderName, balance, accountNumber);

        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        account.displayDetails();
        account.accountType();

        Transaction operations = (Transaction) account;


        int option;

        do {
            System.out.println("******* Choose any one ******");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit ");
            System.out.println("Choose an option ");
            option =scanner.nextInt();

            switch (option) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    operations.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    operations.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 4);
        scanner.close();
    }
}



