
class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 60000;
    }
}

class question14 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());

        Employee ref = new Manager();
        System.out.println("Salary using parent reference: "
                + ref.calculateSalary());
    }
}
