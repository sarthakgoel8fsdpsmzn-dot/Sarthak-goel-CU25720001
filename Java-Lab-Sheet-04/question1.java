
class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String details = "Name: " + name + ", Age: " + age;
        System.out.println(details);
    }
}

public class question1 {
    public static void main(String[] args) {
        String studentName = "Sarthak";
        int studentAge = 20;

        Student s1 = new Student(studentName, studentAge);
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();

        System.out.println("Total students: " + Student.count);
    }
}
