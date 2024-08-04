public class StudentRecordMGMT {
    public static void main(String[] args) {
        StudentRecordSystem srs = new StudentRecordSystem();

        // Add some students
        srs.addStudent(new Student(1, "Alice", 20, "Computer Science"));
        srs.addStudent(new Student(2, "Bob", 22, "Mathematics"));

        // Display all students
        srs.displayAllStudents();

        // Get and display a specific student
        Student student = srs.getStudent(1);
        if (student != null) {
            System.out.println("Retrieved: " + student);
        } else {
            System.out.println("Student not found");
        }
    }
}
