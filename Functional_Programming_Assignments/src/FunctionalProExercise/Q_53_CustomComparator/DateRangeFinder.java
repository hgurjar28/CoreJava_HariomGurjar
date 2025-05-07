
//From a list of dates, return the earliest and latest date using a custom comparator and stream operations.
package FunctionalProExercise.Q_53_CustomComparator;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DateRangeFinder {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 12, 25),
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2023, 6, 15),
                LocalDate.of(2025, 3, 10)
        );

        Optional<LocalDate> earliest = dates.stream()
                .min(Comparator.naturalOrder());

        Optional<LocalDate> latest = dates.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Earliest Date: " + earliest.orElse(null));
        System.out.println("Latest Date: " + latest.orElse(null));
    }
}

