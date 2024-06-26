package com.LinkedList;

public class DLL {

     private Node head;
     Node tail;
     int Size;

    public DLL() {
        this.Size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node .prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val){
        Node prev = find(after);
        if(prev == null){
            System.out.println("Dpes not exist");
            return;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if(node.next != null) {
            node.next.prev = node;
        }

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int val){
        Node node = head;
        while (node!= null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node{
         private int val;
         private Node next;
         private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
