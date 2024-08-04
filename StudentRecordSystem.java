import java.util.ArrayList;
import java.util.List;

public class StudentRecordSystem {
    private List<Student> students;
    private int count;

    // Constructor
    public StudentRecordSystem() {
        students = new ArrayList<>();
        count = 0;
    }

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
        count++;
    }

    // Get a student by ID
    public Student getStudent(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null; // Or throw an exception if the student is not found
    }

    // Display all students
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
