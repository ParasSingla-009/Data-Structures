package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] newarr = new int[n];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if (i != j && arr[j] < arr[i]) {
                    count++;
                }
            }
            newarr[i] = count;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
