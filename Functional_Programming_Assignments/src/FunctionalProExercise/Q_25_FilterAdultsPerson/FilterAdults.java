
//Given a list of people (name, age), filter adults (age > 18) and collect names.
package FunctionalProExercise.Q_25_FilterAdultsPerson;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAdults {
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ankit", 17),
                new Person("Vinit", 25),
                new Person("Chetan", 18),
                new Person("Pawan", 20),
                new Person("Rohit", 20)
        );

        List<String> adults = people.stream()
                .filter(p -> p.age > 18)
                .map(p -> p.name)
                .collect(Collectors.toList());


        System.out.println("Adult names: " + adults);
    }
}
