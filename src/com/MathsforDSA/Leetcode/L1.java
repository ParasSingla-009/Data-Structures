package com.MathsforDSA.Leetcode;

import java.util.ArrayList;

// 238 product of array itself
public class L1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int pro = 1;
            for(int j=0; j<nums.length; j++){
                if(i == j) continue;
                pro *= nums[j];
            }
            List.add(pro);
        }
        System.out.println(List);

    }
}
