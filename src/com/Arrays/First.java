package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
