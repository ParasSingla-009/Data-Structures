package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];
        int[] newarr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            index[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int y = index[i];
            newarr[i] = arr[y];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

