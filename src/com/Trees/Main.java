package com.Trees;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);
        tree.display();
        tree.preOrder();
    }
}
