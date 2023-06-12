package test;

import datastructures.ArrayList;
import datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(17);
        list.add(20);
        list.add(3, 10);

        System.out.println(list.toString());
    }
}