package com.LinearSearch;

import java.util.Scanner;

public class SearchRangr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans = linearSearch(nums,target,start,end);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
