package Pro_4_Task;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        int deadlineCompare = t1.getDeadline().compareTo(t2.getDeadline());
        if (deadlineCompare == 0) {
            // Higher priority first if deadlines are the same
            return Integer.compare(t2.getPriority(), t1.getPriority());
        }
        return deadlineCompare; // Earlier deadline first
    }
}

