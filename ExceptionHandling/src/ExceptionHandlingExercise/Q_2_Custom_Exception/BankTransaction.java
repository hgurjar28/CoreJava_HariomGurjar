
//Define a base custom exception BankingException and two subclasses:
//InsufficientFundsException and InvalidAccountException.
//Write a method transferFunds() that can throw either.
//Demonstrate catching them separately and together (by catching the parent).

package ExceptionHandlingExercise.Q_2_Custom_Exception;

class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}


class InsufficientFundsException extends BankingException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class InvalidAccountException extends BankingException {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class BankTransaction {


    public static void transferFunds(double balance, String accountNumber) throws BankingException {
        if (balance < 1000) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new InvalidAccountException("Invalid account number.");
        }
        System.out.println("Funds transferred successfully.");
    }

    public static void main(String[] args) {


        try {
            transferFunds(500, "12345");
        } catch (InsufficientFundsException e) {
            System.out.println("Caught InsufficientFundsException: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("Caught InvalidAccountException: " + e.getMessage());
        } catch (BankingException e) {
            throw new RuntimeException(e);
        }


        try {
            transferFunds(1500, "");
        } catch (BankingException e) {
            System.out.println("Caught BankingException: " + e.getMessage());
        }
    }
}
