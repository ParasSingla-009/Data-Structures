package com.LinkedList;

import org.w3c.dom.Node;

public class Main {


    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insetLast(9500);
//        list.insert(1500,2);
//        list.display();
//        list.DeleteFirst();
//        list.display();
//        list.DeleteLast();
//        list.display();
//        list.Delete(2);
//        list.display();
//        list.insertRec(750,2);
//        list.display();

        LL list2 = new LL();
        list2.insertFirst(3);
        list2.insertFirst(3);
        list2.insertFirst(2);
        list2.insertFirst(1);
        list2.insertFirst(1);
        list2.display();
        list2.duplicatestoRemove();
        list2.display();


    }
}
