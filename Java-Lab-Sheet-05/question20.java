
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }

    double calculateSalary() {
        return getSalary();
    }
}

interface Researcher {
    void conductResearch();
}

class Teacher extends Employee implements Researcher {
    String subject;

    void teach() {
        System.out.println("Teaching subject: " + subject);
    }

    @Override
    void calculateSalaryDisplay() {
        // Not used
    }

    @Override
    double calculateSalary() {
        return getSalary() + 5000;
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher is conducting research.");
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing department: " + department);
    }
}

class question20 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setEmployeeId(101);
        t.setEmployeeName("Mr. Sharma");
        t.setSalary(40000);
        t.subject = "Java";

        System.out.println("--- Teacher Details ---");
        t.displayDetails();
        t.teach();
        t.conductResearch();
        System.out.println("Calculated Salary: " + t.calculateSalary());

        VisitingTeacher v = new VisitingTeacher();
        v.setEmployeeId(102);
        v.setEmployeeName("Ms. Verma");
        v.setSalary(0);
        v.subject = "Programming";
        v.hoursWorked = 40;

        System.out.println("\n--- Visiting Teacher ---");
        v.displayDetails();
        v.teach();
        System.out.println("Calculated Salary: " + v.calculateSalary());

        Admin a = new Admin();
        a.setEmployeeId(103);
        a.setEmployeeName("Amit");
        a.setSalary(35000);
        a.department = "Administration";

        System.out.println("\n--- Admin Details ---");
        a.displayDetails();
        a.manageDepartment();
        System.out.println("Calculated Salary: " + a.calculateSalary());
    }
}
