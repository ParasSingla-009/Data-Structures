package com.In_Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltDeQue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(78);
        deque.addLast(35);
        deque.removeFirst();
    }
}
