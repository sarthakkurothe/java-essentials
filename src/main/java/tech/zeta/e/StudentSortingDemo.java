package tech.zeta.e;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 103, 3.8));
        students.add(new Student("Bob", 101, 3.5));
        students.add(new Student("Charlie", 105, 3.9));
        students.add(new Student("David", 102, 3.7));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by ID:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
