package com.BinarySearch;
// Find in Mountain Array.
import java.util.Scanner;

public class FEIMA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = oabs(arr, target, 0, peak);
        if(firstTry != -1){
            return (firstTry);
        }
        return(oabs(arr, target, peak+1, arr.length-1));
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

    static int oabs(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start) /2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
