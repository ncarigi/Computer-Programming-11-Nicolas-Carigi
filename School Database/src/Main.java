public class Main {
    public static void main(String[] args) {
        //System.out.println(Teacher);

        School school1 = new School("Sesame High School", "372 Sesame Street, Vancouver, BC", 420);

        System.out.println(school1);

        //Add 10 students to student list
        school1.addStudent("Sebastian", "Green", 8);
        school1.addStudent("Alexander", "Walker", 11);
        school1.addStudent("Sophie", "Smith", 8);
        school1.addStudent("Cookie", "Monster", 10);
        school1.addStudent("Liam", "Anderson", 9);
        school1.addStudent("Aiden", "Wilson", 8);
        school1.addStudent("Elmo","Monster",12);
        school1.addStudent("Ava", "Taylor", 9);
        school1.addStudent("Scarlett", "Phillips", 11);
        school1.addStudent("Olivia", "Jones", 8);


        //add 3 teachers to teacher list
        school1.addTeacher("Isabella", "Miller", "History");
        school1.addTeacher("Big", "Bird", "English");
        school1.addTeacher("Carter", "Wright", "Math");

        //display both lists
        System.out.println(school1.showStudents());
        System.out.println(school1.showTeachers());

        //remove 2 students
        System.out.println(school1.deleteStudent(6));
        System.out.println(school1.deleteStudent(3));

        //remove 1 teacher
        System.out.println(school1.deleteTeacher(1));

        //display both lists
        System.out.println(school1.showStudents());
        System.out.println(school1.showTeachers());

    }
}