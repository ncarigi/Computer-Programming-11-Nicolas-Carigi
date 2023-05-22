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
        String dt = teachers.get((e - 1)).getFirstName() + " " + teachers.get((e - 1)).getLastName() + " has been removed\n";
        teachers.remove((e - 1));
        return dt;
    }

    // Shows all the teachers
    public String showTeachers() {
        String at = "";
        for (int i = 0; i < teachers.size(); i++) {
            at = at + "[" + (i + 1) + "] " + teachers.get(i).toString();
        }
        return "Showing all teachers:\n" + at + "\n";
    }

    // Adds a student to the list of students
    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    }

    // Deletes a student from the list of students
    public String deleteStudent(int e) {
        String ds = students.get((e - 1)).getFirstName() + " " + students.get((e - 1)).getLastName() + " has been removed\n";
        students.remove((e - 1));
        return ds;
    }

    // Shows all the students
    public String showStudents() {
        String as = "";
        for (int i = 0; i < students.size(); i++) {
            as = as + "[" + (i + 1) + "] " + students.get(i).toString();
        }
        return "Showing all Students:\n" + as + "\n";
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
