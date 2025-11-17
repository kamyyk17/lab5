public class Student {
    private String firstName;  // Imię
    private String lastName;   // Nazwisko
    private int age;           // Wiek
    private String major;      // Kierunek studiów
    private String hobby;      // Hobby
    private String sexualOrientation; // Orientacja seksualna

    // Konstruktor
    public Student(String firstName, String lastName, int age, String major, String hobby, String sexualOrientation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.hobby = hobby;
        this.sexualOrientation = sexualOrientation;
    }

    // Nadpisana metoda toString() - wypisujemy wszystkie dane
    @Override
    public String toString() {
        return "Student{firstName='" + firstName + "', lastName='" + lastName + "', age=" + age +
               ", major='" + major + "', hobby='" + hobby + "', sexualOrientation='" + sexualOrientation + "'}";
    }
}