import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Brak studentów do wyświetlenia.");
            return;
        }
        System.out.println("\nLista studentów:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}