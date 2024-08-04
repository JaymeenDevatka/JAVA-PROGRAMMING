public class CourseEnrollment {
    private Course[] courseCatalog;
    private Enrollment enrollment;

    // Constructor
    public CourseEnrollment(Course[] courseCatalog, int numberOfStudents) {
        this.courseCatalog = courseCatalog;
        this.enrollment = new Enrollment(numberOfStudents, courseCatalog.length);
    }

    // Main method
    public static void main(String[] args) {
        // Create course catalog
        Course[] courseCatalog = {
            new Course(101, "Mathematics", 3),
            new Course(102, "Computer Science", 4)
        };

        // Create CourseEnrollment system
        CourseEnrollment system = new CourseEnrollment(courseCatalog, 10);

        // Enroll students
        system.enrollment.enroll(0, 101);
        system.enrollment.enroll(0, 102);
        system.enrollment.enroll(1, 101);

        // Display enrolled courses for student ID 0
        system.enrollment.getEnrolledCourses(0, courseCatalog);

        // Drop a course for student ID 0
        system.enrollment.drop(0, 101);

        // Display enrolled courses for student ID 0
        system.enrollment.getEnrolledCourses(0, courseCatalog);
    }
}
