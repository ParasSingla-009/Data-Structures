package com.In_Stack_Queue;
import java.util.Stack;
public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,2};
        System.out.println(find132pattern(nums));
    }
    static public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] < third){
                return true;
            }
            while(!stack.empty() && stack.peek() < nums[i]){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
