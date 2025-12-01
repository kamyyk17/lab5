import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Brak studentów.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    
    public Student findStudentByName(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }
}