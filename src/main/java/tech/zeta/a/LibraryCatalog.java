package tech.zeta.a;


import java.util.TreeSet;

public class LibraryCatalog {
    public static void main(String[] args) {

        TreeSet<Book> catalog = new TreeSet<>();

        catalog.add(new Book("The Alchemist", "Paulo Coelho"));
        catalog.add(new Book("Harry Potter", "J.K. Rowling"));
        catalog.add(new Book("A Tale of Two Cities", "Charles Dickens"));
        catalog.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        catalog.add(new Book("Pride and Prejudice", "Jane Austen"));

        System.out.println("Library Catalog (Sorted by Title):");
        for (Book book : catalog) {
            System.out.println(book);
        }
    }
}