package com.In_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
    }
}
