package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++){
                arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
