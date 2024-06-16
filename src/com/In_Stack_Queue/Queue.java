package com.In_Stack_Queue;

public class Queue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Queue(){
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i+1];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display(){

    }
}
