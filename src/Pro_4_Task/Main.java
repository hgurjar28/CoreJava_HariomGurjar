
//Problem 4: Task Prioritization Engine (PriorityQueue, Comparator)
//Create a Task class with name, priority, deadline.
//        •	Use PriorityQueue  to order by closest deadline, then highest priority.
//•	Poll and print tasks as they should be executed.



package Pro_4_Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();


        scheduler.addTask(new Task("Write Report", 2, LocalDate.of(2025, 5, 2)));
        scheduler.addTask(new Task("Submit Tax", 3, LocalDate.of(2025, 4, 30)));
        scheduler.addTask(new Task("Prepare Presentation", 1, LocalDate.of(2025, 5, 1)));
        scheduler.addTask(new Task("Fix Critical Bug", 5, LocalDate.of(2025, 4, 30)));
        scheduler.addTask(new Task("Team Meeting", 1, LocalDate.of(2025, 5, 2)));


        scheduler.processTasks();
    }
}
