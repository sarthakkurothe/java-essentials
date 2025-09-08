package tech.zeta.b;

import java.util.LinkedList;
import java.util.Collections;

class NumberList {
    private LinkedList<Integer> numbers;

    public NumberList() {
        numbers = new LinkedList<>();
    }

    public void addNumber(int num) {
        numbers.add(num);
    }

    public void reverseList() {
        Collections.reverse(numbers);
    }

    public void displayList() {
        System.out.println(numbers);
    }
}
