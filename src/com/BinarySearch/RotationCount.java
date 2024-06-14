package com.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(countrotation(arr));
    }

    private static int countrotation(int[] arr) {
        int pivot = findPivot(arr);
        if(pivot == -1){
            return 0;
        }
        return pivot +1;
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid -1;
            }
            if(nums[start] <= nums[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

}