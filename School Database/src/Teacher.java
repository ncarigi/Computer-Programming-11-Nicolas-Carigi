public class Teacher {
    // Fields for Teacher
    private String firstName;
    private String lastName;
    private String subject;

    // Constructor
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // String representation of the Teacher object
    @Override
    public String toString() {
        // Return the formatted string representation of the Teacher object
        return "Name: " + firstName + " " + lastName + "\t Subject: " + subject + "\n";
    }

    // Getters and setters

    // Get the first name of the teacher
    public String getFirstName() {
        return firstName;
    }

    // Set the first name of the teacher
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get the last name of the teacher
    public String getLastName() {
        return lastName;
    }

    // Set the last name of the teacher
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get the subject of the teacher
    public String getSubject() {
        return subject;
    }

    // Set the subject of the teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
