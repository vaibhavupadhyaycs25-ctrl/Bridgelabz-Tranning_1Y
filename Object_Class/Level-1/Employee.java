class Employee {

    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name = "Rahul";
        e1.id = 101;
        e1.salary = 50000;

        e1.displayDetails();
    }
}