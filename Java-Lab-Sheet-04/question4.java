
class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        String details = "Employee ID: " + empId;
        System.out.println(details);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }
}

public class question4 {
    public static void main(String[] args) {
        int id = 101;
        double empSalary = 35000;

        Employee e = new Employee(id, empSalary);
        e.display();
    }
}
