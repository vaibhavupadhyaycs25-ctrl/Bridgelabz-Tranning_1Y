package Encapulation;
interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId);
        System.out.println(name);
        System.out.println(baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private double rate;
    private String department;

    public PartTimeEmployee(int id, String name, double salary, int hours, double rate) {
        super(id, name, salary);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}


class main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(2, "Aman", 0, 5, 500);

        Department d1 = (Department) e1;
        Department d2 = (Department) e2;

        d1.assignDepartment("IT");
        d2.assignDepartment("HR");

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());

            Department d = (Department) e;
            d.getDepartmentDetails();

            System.out.println();
        }
    }
}