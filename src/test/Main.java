package test;

import datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.add(1, 7);
        ll.display();
        System.out.println(ll.contains(2));

    }
}