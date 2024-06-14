package com.Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,14,1,8,7,14,19};
        System.out.println(find(arr, 14,0));
        System.out.println(findindex(arr, 14, 0));
        findAllindex(arr, 14, 0);
        System.out.println(list);
    }
    static boolean find(int[] arr , int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findindex(int[] arr , int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllindex(int[] arr , int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllindex(arr, target, index+1);
    }
}

