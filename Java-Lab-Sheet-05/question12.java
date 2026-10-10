
class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writing code in " + programmingLanguage);
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Conducting meeting in " + department);
    }
}

class question12 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Aman";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        d.displayEmployee();
        d.writeCode();

        Manager m = new Manager();
        m.employeeName = "Rohit";
        m.employeeId = 102;
        m.department = "IT";

        m.displayEmployee();
        m.conductMeeting();
    }
}
