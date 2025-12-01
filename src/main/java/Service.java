    import java.io.*;
    import java.util.*;

    public class Service {

        private List<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
            saveToFile();
        }

        public void printAllStudents() {
            for (Student s : students) {
                System.out.println(s);
            }
        }

        public Student findStudentByName(String firstName, String lastName) {
            for (Student s : students) {
                if (s.getFirstName().equalsIgnoreCase(firstName)
                        && s.getLastName().equalsIgnoreCase(lastName)) {
                    return s;
                }
            }
            return null;
        }

        // ------------------ NOWA METODA ------------------
        public boolean deleteStudentByName(String firstName, String lastName) {
            boolean removed = students.removeIf(s ->
                    s.getFirstName().equalsIgnoreCase(firstName)
                            && s.getLastName().equalsIgnoreCase(lastName)
            );

            if (removed) {
                saveToFile(); // zapisujemy zmiany do pliku
            }

            return removed;
        }
        // -------------------------------------------------


        // ------- zapis listy studentów do pliku ----------
        private void saveToFile() {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("db.txt"))) {

                for (Student s : students) {
                    bw.write(
                            s.getFirstName() + ";" +
                            s.getLastName() + ";" +
                            s.getAge() + ";" +
                            s.getMajor() + ";" +
                            s.getHobby() + ";" +
                            s.getSexualOrientation() + ";" +
                            s.getDateOfBirth()
                    );
                    bw.newLine();
                }

            } catch (IOException e) {
                System.out.println("Błąd zapisu danych: " + e.getMessage());
            }
        }
    }