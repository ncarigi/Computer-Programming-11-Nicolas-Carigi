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
        return "Name: " + firstName + " " + lastName + "\t Subject: " + subject + "\n";
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
