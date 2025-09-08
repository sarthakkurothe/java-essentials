package tech.zeta.c;
import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemoval {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sarthak");
        names.add("Aarav");
        names.add("Priya");
        names.add("Sarthak");
        names.add("Meera");
        names.add("Priya");

        System.out.println("Original List: " + names);

        HashSet<String> uniqueNames = new HashSet<>(names);

        System.out.println("Unique Strings: " + uniqueNames);
    }
}
