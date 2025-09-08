package tech.zeta.d;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedContactList {
    private TreeMap<String, String> contacts;

    public SortedContactList() {
        contacts = new TreeMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Contact added: " + name + " -> " + phone);
    }

    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + " -> " + contacts.get(name));
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
        } else {
            System.out.println("Contact List:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        SortedContactList contactList = new SortedContactList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Contact List Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contactList.addContact(name, phone);
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    name = scanner.nextLine();
                    contactList.removeContact(name);
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    contactList.searchContact(name);
                    break;

                case 4:
                    contactList.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
