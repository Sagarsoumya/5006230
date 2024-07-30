package WEEK_1.Algorithms_And_Data_Structure.Exercise5;

public class TaskManagementSystem {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public boolean deleteTask(int taskId) {
        Node current = head;
        Node previous = null;
        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }
        if (current == null)
            return false;
        if (previous == null)
            head = current.next;
        else
            previous.next = current.next;
        return true;
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        tms.addTask(new Task(1, "Design Database", "In Progress"));
        tms.addTask(new Task(2, "Develop API", "Not Started"));
        tms.addTask(new Task(3, "Write Documentation", "In Progress"));

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = tms.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        System.out.println("\nDeleting Task with ID 2:");
        boolean deleted = tms.deleteTask(2);
        System.out.println(deleted ? "Task deleted" : "Task not found");

        System.out.println("\nAll Tasks after deletion:");
        tms.traverseTasks();
    }
}
