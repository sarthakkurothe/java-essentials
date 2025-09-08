package tech.zeta.a;
import java.util.HashSet;

public class EmailSet {
    public static void main(String[] args) {

        HashSet<String> emailSet = new HashSet<>();

        emailSet.add("sarthak@example.com");
        emailSet.add("aarav@example.com");
        emailSet.add("priya@example.com");
        emailSet.add("rohan@example.com");
        emailSet.add("meera@example.com");

        emailSet.add("sarthak@example.com");

        System.out.println("Set of Unique Email Addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}
