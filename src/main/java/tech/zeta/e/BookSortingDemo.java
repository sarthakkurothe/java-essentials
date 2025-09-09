package tech.zeta.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSortingDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", 2018));
        books.add(new Book("Clean Code", "Robert C. Martin", 2008));
        books.add(new Book("Design Patterns", "Erich Gamma", 1994));
        books.add(new Book("Java Concurrency in Practice", "Brian Goetz", 2006));

        System.out.println("Before sorting:");
        for (Book b : books) {
            System.out.println(b);
        }

        Comparator<Book> yearDescComparator = (b1, b2) -> Integer.compare(b2.getPublicationYear(), b1.getPublicationYear());

        Collections.sort(books, yearDescComparator);

        System.out.println("\nAfter sorting by publication year (descending):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}