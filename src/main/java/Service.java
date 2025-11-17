  import java.util.ArrayList;
  import java.util.List;

  public class Service {
      private List<Student> students;

      public Service() {
          students = new ArrayList<>();
      }

      public void addStudent(Student student) {
          students.add(student);
      }

      public List<Student> getStudents() {
          return students;
      }

      public void printAllStudents() {
          if (students.isEmpty()) {
              System.out.println("Brak studentów w bazie.");
          } else {
              System.out.println("\nLista wszystkich studentów:");
              for (Student student : students) {
                  System.out.println(student);
              }
          }
      }
  }