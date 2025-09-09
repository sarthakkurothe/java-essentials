package tech.zeta.e;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR", 50000));
        employees.add(new Employee("Bob", "IT", 75000));
        employees.add(new Employee("Charlie", "Finance", 60000));
        employees.add(new Employee("David", "IT", 90000));
        employees.add(new Employee("Eve", "HR", 70000));
        employees.add(new Employee("Frank", "Finance", 65000));

        System.out.println("Before sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Comparator<Employee> employeeComparator = Comparator
                .comparing(Employee::getDepartment)
                .thenComparing(Comparator.comparing(Employee::getSalary).reversed());

        Collections.sort(employees, employeeComparator);

        System.out.println("\nAfter sorting (by department, then salary descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

