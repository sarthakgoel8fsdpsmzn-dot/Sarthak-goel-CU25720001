
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println(name + " is studying " + course);
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

class question11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sarthak";
        s.course = "BCA";
        s.displayName();
        s.study();

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Java";
        t.displayName();
        t.teach();
    }
}
