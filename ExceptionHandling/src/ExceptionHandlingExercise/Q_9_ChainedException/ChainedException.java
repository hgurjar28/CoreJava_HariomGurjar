
//Simulate a layered app:
//         Repository throws SQLException.
//         Service layer catches it, wraps it in a ServiceLayerException.
//         Controller layer catches ServiceLayerException and logs it.
//Write code demonstrating this multi-layer exception wrapping.

package ExceptionHandlingExercise.Q_9_ChainedException;
import java.sql.SQLException;


class ServiceLayerException extends Exception {
    public ServiceLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Repository {
    public void fetchData() throws SQLException {
        throw new SQLException("Database connection failed.");
    }
}


class Service {
    private Repository repository = new Repository();

    public void fetchDataFromRepository() throws ServiceLayerException {
        try {
            repository.fetchData();
        } catch (SQLException e) {
            throw new ServiceLayerException("Service layer failed due to repository issue.", e);
        }
    }
}


class Controller {
    private Service service = new Service();

    public void processRequest() {
        try {
            service.fetchDataFromRepository();
        } catch (ServiceLayerException e) {
            System.out.println("Logging error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}

public class ChainedException {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.processRequest();
    }
}
