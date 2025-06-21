package Exercise10MVCPatternExample;


public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Hari Krishna", "CS101", "A");

      
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

      
        controller.updateView();

       
        controller.setStudentName("Aranmula Hari Krishna");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
