
//Simulate a batch job: given a list of jobs (name, status), return only failed job names in uppercase, sorted alphabetically.
package FunctionalProExercise.Q_55_SimulateBatchJob;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BatchJobProcessor {
    public static void main(String[] args) {
        class Job {
            String name;
            String status;

            public Job(String name, String status) {
                this.name = name;
                this.status = status;
            }
        }

        List<Job> jobs = Arrays.asList(
                new Job("Job1", "SUCCESS"),
                new Job("Job2", "FAILED"),
                new Job("Job3", "FAILED"),
                new Job("Job4", "SUCCESS"),
                new Job("Job5", "FAILED")
        );

        List<String> failedJobNames = jobs.stream()
                .filter(job -> job.status.equalsIgnoreCase("FAILED"))
                .map(job -> job.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Failed Jobs: " + failedJobNames);
    }
}

