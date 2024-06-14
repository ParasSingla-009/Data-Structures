package com.InsertionSort;

import java.util.ArrayList;
import java.util.List;

//find all number diaaspeared in array leetcode..
class FANDIA {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}