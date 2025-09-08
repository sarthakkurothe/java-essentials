package tech.zeta.d;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}


