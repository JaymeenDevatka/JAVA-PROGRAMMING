public class GradingSystemMGTM {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();

        // Create and add students
        Student1 student1 = new Student1(1, "Alice");
        Student1 student2 = new Student1(2, "Bob");
        gradingSystem.addStudent(student1);
        gradingSystem.addStudent(student2);

        // Add course credits
        gradingSystem.addCourseCredits(101, 3); // Course 101 with 3 credits
        gradingSystem.addCourseCredits(102, 4); // Course 102 with 4 credits

        // Add grades
        Grade grade1 = new Grade(1, 101, 'A');
        Grade grade2 = new Grade(1, 102, 'B');
        Grade grade3 = new Grade(2, 101, 'C');
        gradingSystem.addGrade(grade1);
        gradingSystem.addGrade(grade2);
        gradingSystem.addGrade(grade3);

        // Calculate and print GPA
        System.out.println("GPA of student 1: " + gradingSystem.calculateGPA(1));
        System.out.println("GPA of student 2: " + gradingSystem.calculateGPA(2));
    }
}
