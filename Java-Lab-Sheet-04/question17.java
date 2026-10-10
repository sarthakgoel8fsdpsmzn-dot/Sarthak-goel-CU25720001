
class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    StudentGrade(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void assignGrade() {
        int score = marks;
        char grade;

        if (score < 0 || score > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= passingMarks) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Name: " + name);
        System.out.println("Marks: " + score);
        System.out.println("Grade: " + grade);
    }
}

public class question17 {
    public static void main(String[] args) {
        String studentName = "Rahul";
        int studentMarks = 85;

        StudentGrade s = new StudentGrade(studentName, studentMarks);
        s.assignGrade();
    }
}
