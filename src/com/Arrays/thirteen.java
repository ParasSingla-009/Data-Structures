package com.Arrays;

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int y=0;
        int count1 = 0;
        int finalcount = 0;
        for(int i=0; i<n; i++){
            y = nums[i];
            while(y>0){
                y = y / 10;
                count1++;
            }
            if(count1 % 2 == 0){
                finalcount++;
            }
            count1 =0;
        }
        System.out.println(finalcount);
    }
}
