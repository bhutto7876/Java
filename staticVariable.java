class Employee {
    static String companyName = "TechCorp"; // Shared by all instances
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " works at " + companyName);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ali");
        Employee e2 = new Employee("Sara");

        e1.display();
        e2.display();

        Employee.companyName = "SoftTech"; // Changing static variable

        e1.display();
        e2.display();
    }
}
