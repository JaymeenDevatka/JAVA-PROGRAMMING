public class Enrollment {
    private int[][] studentCourses;
    private int[] count;

    // Constructor
    public Enrollment(int numberOfStudents, int numberOfCourses) {
        studentCourses = new int[numberOfStudents][numberOfCourses];
        count = new int[numberOfStudents];
    }

    // Enroll a student in a course
    public void enroll(int studentID, int courseID) {
        studentCourses[studentID][count[studentID]++] = courseID;
    }

    // Drop a course for a student
    public void drop(int studentID, int courseID) {
        for (int i = 0; i < count[studentID]; i++) {
            if (studentCourses[studentID][i] == courseID) {
                studentCourses[studentID][i] = studentCourses[studentID][--count[studentID]];
                studentCourses[studentID][count[studentID]] = 0;
                break;
            }
        }
    }

    // Get enrolled courses for a student
    public void getEnrolledCourses(int studentID, Course[] courseCatalog) {
        System.out.println("Courses for student ID " + studentID + ":");
        for (int i = 0; i < count[studentID]; i++) {
            int courseID = studentCourses[studentID][i];
            for (Course course : courseCatalog) {
                if (course.getCourseID() == courseID) {
                    System.out.println(course);
                }
            }
        }
    }
}
