// Base class: Employee
abstract class Employee {
    String name, address, jobTitle;
    double salary;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    abstract double calculateBonus();
    abstract String generatePerformanceReport();
    abstract void manageProjects();
}

// Subclass: Manager
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }

    @Override
    String generatePerformanceReport() {
        return "Manager " + name + " has exceeded expectations.";
    }

    @Override
    void manageProjects() {
        System.out.println("Manager " + name + " is handling multiple projects.");
    }
}

// Subclass: Developer
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // 15% bonus
    }

    @Override
    String generatePerformanceReport() {
        return "Developer " + name + " has delivered high-quality code.";
    }

    @Override
    void manageProjects() {
        System.out.println("Developer " + name + " is working on software development.");
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    @Override
    String generatePerformanceReport() {
        return "Programmer " + name + " has optimized the system performance.";
    }

    @Override
    void manageProjects() {
        System.out.println("Programmer " + name + " is debugging and testing programs.");
    }
}

// Main class to test
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "New York", 80000);
        System.out.println(manager.generatePerformanceReport());
        System.out.println("Bonus: $" + manager.calculateBonus());
        manager.manageProjects();

        Employee developer = new Developer("Bob", "California", 70000);
        System.out.println(developer.generatePerformanceReport());
        System.out.println("Bonus: $" + developer.calculateBonus());
        developer.manageProjects();

        Employee programmer = new Programmer("Charlie", "Texas", 60000);
        System.out.println(programmer.generatePerformanceReport());
        System.out.println("Bonus: $" + programmer.calculateBonus());
        programmer.manageProjects();
    }
}
