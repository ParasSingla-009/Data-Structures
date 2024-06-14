package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i =0; i<n; i++){
            candies[i] = sc.nextInt();
        }
        boolean[] newcandy = new boolean[n];
        int extracandies = sc.nextInt();
        for(int i=0; i<candies.length; i++){
            for(int j=1; j<n; j++){
                if(candies[i] + extracandies >= candies[j] && i != j){
                    newcandy[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(newcandy));
    }
}
