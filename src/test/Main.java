package test;

import datastructures.ArrayList;
import datastructures.LinkedList;
import datastructures.Queue;
import datastructures.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        s.display();

        System.out.println(s.pop());

        s.display();
    }

}