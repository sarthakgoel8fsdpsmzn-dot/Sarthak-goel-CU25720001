
class Employee {
    String name;
    double salary;
    static String organization = "ABC Company";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(Employee e) {
        double salary1 = this.salary;
        double salary2 = e.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2) {
            System.out.println(this.name + " has a higher salary.");
        } else if (salary1 < salary2) {
            System.out.println(e.name + " has a higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }
}

public class question29 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 40000);
        Employee e2 = new Employee("Aman", 35000);

        e1.compareSalary(e2);
    }
}
