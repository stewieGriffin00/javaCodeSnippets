
import java.util.Comparator;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", 95000),
                new Employee("Bob", 82000),
                new Employee("Carol", 110000),
                new Employee("Dave", 75000)
        );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));

        System.out.println("highest salary " + employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());
    }
}

class Employee {

    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " → ₹" + salary;
    }
}

// Sample data used across all approaches

