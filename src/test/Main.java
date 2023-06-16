package test;

import datastructures.ArrayList;
import datastructures.LinkedList;
import datastructures.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.insert(2);
        queue.insert(10);
        queue.insert(100);
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.display();
    }

}