package Pro_4_Task;

import java.util.PriorityQueue;

public class TaskScheduler {


    private PriorityQueue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());


    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void processTasks() {
        System.out.println("Task Execution Order:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println(task);
        }
    }
}
