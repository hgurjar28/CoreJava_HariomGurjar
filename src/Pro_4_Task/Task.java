package Pro_4_Task;

import java.time.LocalDate;

public class Task {
    private String name;
    private int priority;
    private LocalDate deadline;

    public Task(String name, int priority, LocalDate deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}
