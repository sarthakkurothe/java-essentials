package tech.zeta.b;
import java.util.TreeSet;
import java.util.Comparator;

public class EmployeeSorting {
    public static void main(String[] args) {

        Comparator<Employee> salaryComparator = (e1, e2) -> {
            if (e1.getSalary() < e2.getSalary()) return 1;
            else if (e1.getSalary() > e2.getSalary()) return -1;
            else return e1.getName().compareTo(e2.getName());
        };

        TreeSet<Employee> employees = new TreeSet<>(salaryComparator);

        employees.add(new Employee("Sarthak", 60000));
        employees.add(new Employee("Aarav", 75000));
        employees.add(new Employee("Priya", 50000));
        employees.add(new Employee("Meera", 75000));
        employees.add(new Employee("Rohan", 65000));

        System.out.println("Employees sorted by salary (descending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
