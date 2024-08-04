import java.util.*;

public class GradingSystem {
    private List<Student1> students = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();
    private Map<Integer, Integer> courseCredits = new HashMap<>();
    private int studentCount = 0;
    private int gradeCount = 0;

    public void addStudent(Student1 student) {
        students.add(student);
        studentCount++;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
        gradeCount++;
    }

    public void addCourseCredits(int courseID, int credits) {
        courseCredits.put(courseID, credits);
    }

    public double calculateGPA(int studentID) {
        int totalPoints = 0;
        int totalCredits = 0;

        for (Grade grade : grades) {
            if (grade.getStudentID() == studentID) {
                int courseID = grade.getCourseID();
                int credits = courseCredits.getOrDefault(courseID, 0);
                totalCredits += credits;
                totalPoints += gradeToPoints(grade.getGrade()) * credits;
            }
        }

        return totalCredits > 0 ? (double) totalPoints / totalCredits : 0.0;
    }

    private int gradeToPoints(char grade) {
        switch (grade) {
            case 'A': return 4;
            case 'B': return 3;
            case 'C': return 2;
            case 'D': return 1;
            case 'F': return 0;
            default: return 0;
        }
    }
}
