package tech.zeta.d;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StudentGpaSorting {
    public static void main(String[] args) {
        Comparator<Student> gpaComparator = (s1, s2) -> {
            int gpaCompare = Double.compare(s2.gpa, s1.gpa); // descending order
            if (gpaCompare == 0) {
                return s1.name.compareTo(s2.name); // tie-break by name
            }
            return gpaCompare;
        };

        TreeMap<Student, String> studentMap = new TreeMap<>(gpaComparator);

        studentMap.put(new Student("Alice", 3.8), "Computer Science");
        studentMap.put(new Student("Bob", 3.6), "Mathematics");
        studentMap.put(new Student("Charlie", 3.9), "Physics");
        studentMap.put(new Student("David", 3.8), "Chemistry");
        studentMap.put(new Student("Eve", 3.7), "Biology");

        System.out.println("Students sorted by GPA (descending):");
        for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Major: " + entry.getValue());
        }
    }
}