
//Create a function that takes a list of people and returns a map of age group (<20, 20-40, 40+) → list of people.
package FunctionalProExercise.Q_39_MapOfAgeGroup;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgeGroups {

    static class Person {
         String name;
         int age;

        Person( String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
         List<Person> people = List.of(
                new Person("Raj", 14),
                new Person("Raman", 24),
                new Person("Hitesh", 47),
                new Person("Lalit", 31)
        );

         Map<String, List<Person>> grouped = people.stream()
                .collect(Collectors.groupingBy(p -> {
                     int age = p.age;
                    if (age < 20) return "Less than 20";
                    else if (age <= 40) return "Between 20-40";
                    else return "Above 40+";
                }));

        System.out.println("Age Groups: " + grouped);
    }
}
