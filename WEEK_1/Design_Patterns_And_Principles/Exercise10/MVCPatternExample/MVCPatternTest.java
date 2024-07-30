package WEEK_1.Design_Patterns_And_Principles.Exercise10.MVCPatternExample;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", 123, "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}

