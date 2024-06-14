package com.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(15);
        list.insertFirst(35);
        list.insertFirst(85);
        list.insertFirst(95);
        list.display();
        list.insertLast(150);
        list.insertLast(300);
        list.insertLast(750);
        list.display();
        list.insert(300, 450);
        list.insert(35, 95);
        list.display();
    }
}
