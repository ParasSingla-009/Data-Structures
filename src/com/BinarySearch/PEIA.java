package com.BinarySearch;
// peak element in mountain array or array
import java.util.Scanner;

public class PEIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1};
        int ans = findinmountainarray(arr);
        System.out.println(ans);
    }
    static int findinmountainarray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return start;
    }

}
