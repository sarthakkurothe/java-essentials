package tech.zeta.b;

public class ReversedLinkedListDemo {
    public static void main(String[] args) {
        NumberList list = new NumberList();

        list.addNumber(10);
        list.addNumber(20);
        list.addNumber(30);
        list.addNumber(40);
        list.addNumber(50);

        System.out.println("Original List:");
        list.displayList();

        list.reverseList();
        System.out.println("Reversed List:");
        list.displayList();
    }
}