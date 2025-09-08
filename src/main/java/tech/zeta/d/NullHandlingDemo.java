package tech.zeta.d;

import java.util.HashMap;
import java.util.TreeMap;

public class NullHandlingDemo {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println("---- HashMap ----");

        hashMap.put(null, "Value for null key");
        hashMap.put("A", null);
        hashMap.put("B", "Hello");
        hashMap.put("C", null);

        System.out.println("HashMap contents: " + hashMap);


        TreeMap<String, String> treeMap = new TreeMap<>();
        System.out.println("\n---- TreeMap ----");

        try {
            treeMap.put(null, "Value for null key");
        } catch (NullPointerException e) {
            System.out.println("Exception inserting null key into TreeMap: " + e);
        }

        treeMap.put("A", null);
        treeMap.put("B", "Hello");
        treeMap.put("C", null);

        System.out.println("TreeMap contents: " + treeMap);
    }
}

