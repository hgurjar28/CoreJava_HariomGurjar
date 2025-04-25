package Q3_EncapsulationWithValidation;

import java.util.Scanner;

class BankAccountManager{
    private  BankAccount account; // Declare a BankAccount object
    private Scanner scanner;

//    Constructor to initialize the scanner obj
    public BankAccountManager(){
        scanner = new Scanner(System.in);
    }

    public void createAccount(){


        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a new BankAccount object
        account = new BankAccount(accountHolder,initialBalance,accountNumber);
        System.out.println("Account created successfully.");
    }

    // Method to perform deposit and withdrawal transactions
    public void transaction(){

        int choice;

        do {
            System.out.println("******* Choose any one ********");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;


                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");

            }

        }while(choice !=4);
        scanner.close();

    }


}