package tech.zeta.a;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Sarthak");
        studentNames.add("Aarav");
        studentNames.add("Priya");
        studentNames.add("Rohan");
        studentNames.add("Meera");

        System.out.println("List of Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}

