package com.In_Stack_Queue;

public class QueueMain {
    public static void main(String[] args) {
//        Queue queue = new Queue(5);
//        queue.insert(7);
//        queue.insert(15);
//        queue.insert(25);
//        queue.insert(45);
//        queue.insert(95);
//        queue.insert(758);
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(7);
        queue.insert(15);
        queue.insert(25);
        queue.insert(45);
        queue.insert(95);
        queue.display();
    }
}
