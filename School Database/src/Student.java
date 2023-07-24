public class Student {
    // Fields for Student
    private String firstName;
    private String lastName;
    private int grade;
    private final int id;
    private static int idIssuer = 1;

    // Constructor
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = idIssuer;
        idIssuer++;
    }

    // String representation of the Student object
    @Override
    public String toString() {
        // Return the formatted string representation of the Student object
        return "Name: " + firstName + " " + lastName + "\t Grade: " + grade + "\t Student Number: " + id + "\n";
    }

    // Getters and setters

    // Get the first name of the student
    public String getFirstName() {
        return firstName;
    }

    // Set the first name of the student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get the last name of the student
    public String getLastName() {
        return lastName;
    }

    // Set the last name of the student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get the grade of the student
    public int getGrade() {
        return grade;
    }

    // Set the grade of the student
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
