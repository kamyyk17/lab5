import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }

    static class Service {
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service s = new Service();

        // Dodawanie studentów z konsoli
        while (true) {
            System.out.println("Podaj imię studenta (lub wpisz 'koniec' aby zakończyć): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("koniec")) {
                break; // Przerwij pętlę, jeśli użytkownik wpisze 'koniec'
            }

            System.out.println("Podaj wiek studenta: ");
            int age = Integer.parseInt(scanner.nextLine()); // Odczytaj wiek jako liczbę całkowitą

            // Tworzymy nowego studenta i dodajemy go do listy
            Student newStudent = new Student(name, age);
            s.addStudent(newStudent);

            System.out.println("Student dodany: " + newStudent.toString());
        }

        // Wyświetlanie listy wszystkich studentów
        System.out.println("\nLista wszystkich studentów:");
        var students = s.getStudents();
        for (Student current : students) {
            System.out.println(current.toString());  // Wyświetlanie każdego studenta
        }

        scanner.close();  // Zamknięcie skanera po zakończeniu
    }
}