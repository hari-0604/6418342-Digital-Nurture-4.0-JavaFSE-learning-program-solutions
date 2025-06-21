package Exercise05TaskManagementSystem.src;

public class TaskManager {
    private Task head;

    // Add task at the end
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added.");
    }

    // Search task by ID
    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task current = head;
        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    // Traverse all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Main test
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(1, "Design DB", "In Progress");
        manager.addTask(2, "Build API", "Not Started");
        manager.addTask(3, "Write Tests", "Completed");

        System.out.println("\nAll Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task t = manager.searchTask(2);
        System.out.println(t != null ? t : "Not Found");

        System.out.println("\nDeleting Task ID 1:");
        manager.deleteTask(1);
        manager.traverseTasks();
    }
}
