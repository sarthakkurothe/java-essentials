package tech.zeta.c;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;
import java.util.Set;

public class SetPerformanceTest {
    public static void main(String[] args) {

        int size = 1_000_000;
        Random random = new Random();

        // ----------- HashSet -----------
        Set<Integer> hashSet = new HashSet<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            hashSet.add(random.nextInt());
        }
        long end = System.currentTimeMillis();
        System.out.println("HashSet - Add time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hashSet.contains(random.nextInt());
        }
        end = System.currentTimeMillis();
        System.out.println("HashSet - Contains time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hashSet.remove(random.nextInt());
        }
        end = System.currentTimeMillis();
        System.out.println("HashSet - Remove time: " + (end - start) + " ms");


        // ----------- TreeSet -----------
        Set<Integer> treeSet = new TreeSet<>();
        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt());
        }
        end = System.currentTimeMillis();
        System.out.println("\nTreeSet - Add time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            treeSet.contains(random.nextInt());
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet - Contains time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            treeSet.remove(random.nextInt());
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet - Remove time: " + (end - start) + " ms");
    }
}

