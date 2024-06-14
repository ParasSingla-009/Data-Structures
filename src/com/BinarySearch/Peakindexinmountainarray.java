package com.BinarySearch;
// peak index in mountain array
import java.util.Scanner;

public class Peakindexinmountainarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

}
