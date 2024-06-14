package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] shuffle_arr = new int[2*n];
        for(int i=0; i<n; i++){
            shuffle_arr[2*i] = arr[i];
            shuffle_arr[2*i+1] = arr[i+n];
        }
        for(int i=0; i<shuffle_arr.length; i++){
            System.out.println(shuffle_arr[i]);
        }
    }
}
