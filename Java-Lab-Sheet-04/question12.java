
class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "Chandigarh University";

    StudentMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

public class question12 {
    public static void main(String[] args) {
        int m1 = 85, m2 = 90, m3 = 80;

        StudentMarks s = new StudentMarks(m1, m2, m3);
        s.calculateAverage();
    }
}
