
//Implement a retry mechanism: write a method that attempts to read from a flaky
//service 3 times. If it fails all 3 times, it throws a
//ServiceUnavailableException.

package ExceptionHandlingExercise.Q_8_ProgrammaticException;

class ServiceUnavailableException extends Exception {
    public ServiceUnavailableException(String message) {
        super(message);
    }
}

class FlakyService {
    private int attempt = 1;

    public String readData() throws ServiceUnavailableException {
        System.out.println("Attempting to read data (Attempt " + attempt + ")");

        if (attempt < 3) {
            attempt++;
            throw new ServiceUnavailableException("Service is unavailable. Retrying...");
        }

        return "Service data received.";
    }
}

public class ProgrammaticException {

    public static void main(String[] args) {
        FlakyService service = new FlakyService();

        try {

            String data = retryServiceCall(service);
            System.out.println("Data successfully retrieved: " + data);
        } catch (ServiceUnavailableException e) {
            System.out.println("Failed to retrieve data after 3 attempts: " + e.getMessage());
        }
    }

    public static String retryServiceCall(FlakyService service) throws ServiceUnavailableException {
        int retries = 3;

        for (int i = 0; i < retries; i++) {
            try {
                return service.readData();
            } catch (ServiceUnavailableException e) {
                System.out.println(e.getMessage());
                if (i == retries - 1) {
                    throw new ServiceUnavailableException("Service is unavailable after " + retries + " attempts.");
                }
            }
        }
        return null;
    }
}
