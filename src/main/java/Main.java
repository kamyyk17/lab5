import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        while (true) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj nowego studenta");
            System.out.println("2. Wypisz wszystkich studentów");
            System.out.println("3. Zakończ program");
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

                    System.out.print("Podaj datę urodzenia (np. 2000-05-11): ");
                    String dateOfBirth = scanner.nextLine();

                    // Nowy konstruktor z dodatkową datą urodzenia
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