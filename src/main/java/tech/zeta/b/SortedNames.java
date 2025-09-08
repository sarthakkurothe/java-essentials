package tech.zeta.b;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortedNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sarthak");
        names.add("Aarav");
        names.add("Priya");
        names.add("Meera");
        names.add("Rohan");
        names.add("Aarav");

        System.out.println("Original List: " + names);

        TreeSet<String> sortedNames = new TreeSet<>(names);

        System.out.println("Sorted Unique Names: " + sortedNames);
    }
}

