
class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Sarthak");
        s1.setRollNo(101);
        s1.setMarks(85.5);

        s1.displayDetails();
    }
}
