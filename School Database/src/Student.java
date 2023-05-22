public class Student {
    // Fields for Student
    private String firstName;
    private String lastName;
    private int grade;
    private int id;
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
        return "Name: " + firstName + " " + lastName + "\t Grade: " + grade + "\t Student Number: " + id + "\n";
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
