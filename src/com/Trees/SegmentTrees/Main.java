package com.Trees.SegmentTrees;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        Segtree tree = new Segtree(arr);
        //tree.display();
        System.out.println(tree.query(2,6));
    }
}
