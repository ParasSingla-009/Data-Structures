package com.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(45);
        list.insert(75);
        list.insert(32);
        list.insert(94);
        list.insert(75);
        list.display();
        list.delete(32);
        list.display();
    }
}
