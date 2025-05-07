
//Use Optional to safely get a value or return a default.
package FunctionalProExercise.Q_20_UseOptional;
import java.util.Optional;

public class OptionalWithDefault {
    public static void main(String[] args) {

        Optional<String> optionalName = Optional.ofNullable(null);

        String name = optionalName.orElse("DefaultName");

        System.out.println("Name: " + name);
    }
}
