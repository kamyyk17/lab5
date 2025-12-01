public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String major;
    private String hobby;
    private String sexualOrientation;
    private String dateOfBirth;

    public Student(String firstName, String lastName, int age, String major,
                   String hobby, String sexualOrientation, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.hobby = hobby;
        this.sexualOrientation = sexualOrientation;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " | wiek: " + age +
                " | kierunek: " + major +
                " | hobby: " + hobby +
                " | orientacja: " + sexualOrientation +
                " | data urodzenia: " + dateOfBirth;
    }
}