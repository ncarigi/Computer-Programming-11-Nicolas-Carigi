import java.util.ArrayList;

public class School {
    // Set up ArrayLists to store teachers and students
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    // Adds a teacher to the list of teachers
    public void addTeacher(String firstName, String lastName, String subject) {
        teachers.add(new Teacher(firstName, lastName, subject));
    }

    // Deletes a teacher from the list of teachers
    public String deleteTeacher(int e) {
        // Get the details of the teacher to be deleted
        String deletedTeacher = teachers.get((e - 1)).getFirstName() + " " + teachers.get((e - 1)).getLastName() + " has been removed\n";

        // Remove the teacher from the list
        teachers.remove((e - 1));

        // Return the details of the deleted teacher
        return deletedTeacher;
    }

    // Shows all the teachers
    public String showTeachers() {
        StringBuilder allTeachers = new StringBuilder();

        // Iterate over the teachers list
        for (int i = 0; i < teachers.size(); i++) {
            // Append the details of each teacher to the StringBuilder
            allTeachers.append(teachers.get(i).toString());
        }

        // Return the formatted string representation of all teachers
        return "Showing all teachers:\n" + allTeachers + "\n";
    }

    // Adds a student to the list of students
    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    }

    // Deletes a student from the list of students
    public String deleteStudent(int e) {
        // Get the details of the student to be deleted
        String deletedStudent = students.get((e - 1)).getFirstName() + " " + students.get((e - 1)).getLastName() + " has been removed\n";

        // Remove the student from the list
        students.remove((e - 1));

        // Return the details of the deleted student
        return deletedStudent;
    }

    // Shows all the students
    public String showStudents() {
        StringBuilder allStudents = new StringBuilder();

        // Iterate over the students list
        for (int i = 0; i < students.size(); i++) {
            // Append the details of each student to the StringBuilder
            allStudents.append(students.get(i).toString());
        }

        // Return the formatted string representation of all students
        return "Showing all Students:\n" + allStudents + "\n";
    }

    // Fields School class
    private String name;
    private String address;
    private int capacity;

    // Constructor for the School class
    public School(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    // String representation of the School object
    @Override
    public String toString() {
        // Return the formatted string representation of the School object
        return "Name: " + this.name + "\t Address: " + this.address + "\t Capacity: (" + students.size() + "/" + this.capacity + ")\n";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
