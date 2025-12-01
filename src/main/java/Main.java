import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        while (true) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj nowego studenta");
            System.out.println("2. Wypisz wszystkich studentów");
            System.out.println("3. Wyszukaj studenta");
             System.out.println("4. Usuń studenta");
            System.out.println("5. Zakończ program");
            System.out.print("Wybór: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Podaj imię studenta: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Podaj nazwisko studenta: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Podaj wiek studenta: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Podaj kierunek studiów: ");
                    String major = scanner.nextLine();

                    System.out.print("Podaj hobby studenta: ");
                    String hobby = scanner.nextLine();

                    System.out.print("Podaj orientację seksualną studenta: ");
                    String sexualOrientation = scanner.nextLine();

                    System.out.print("Podaj datę urodzenia (rrrr-mm-dd): ");
                    String dateOfBirth = scanner.nextLine();

                    Student newStudent = new Student(
                            firstName,
                            lastName,
                            age,
                            major,
                            hobby,
                            sexualOrientation,
                            dateOfBirth
                    );

                    service.addStudent(newStudent);
                    System.out.println("Student został dodany.");
                    break;

                case "2":
                    service.printAllStudents();
                    break;

                case "3":
                    // NOWA OPCJA — wyszukiwanie
                    System.out.print("Podaj imię studenta: ");
                    String searchFirstName = scanner.nextLine();

                    System.out.print("Podaj nazwisko studenta: ");
                    String searchLastName = scanner.nextLine();

                    Student found = service.findStudentByName(searchFirstName, searchLastName);

                    if (found != null) {
                        System.out.println("Znaleziono studenta:");
                        System.out.println(found);
                    } else {
                        System.out.println("Nie znaleziono studenta o podanym imieniu i nazwisku.");
                    }
                    break;

                case "4":
 System.out.print("Podaj imię studenta do usunięcia: ");
        String delFirst = scanner.nextLine();

        System.out.print("Podaj nazwisko studenta do usunięcia: ");
        String delLast = scanner.nextLine();

        boolean deleted = service.deleteStudentByName(delFirst, delLast);

        if (deleted) {
            System.out.println("Student został usunięty.");
        } else {
            System.out.println("Nie znaleziono studenta o podanych danych.");
        }
        break;

    case "5":
        System.out.println("Zamykanie programu.");
        scanner.close();
        return;

    default:
        System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
        break;

            }
        }
    }
}
