package com.Arrays;

import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int [n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int p = 0;
        int sum = 0;
        while(p<n){
           sum += num[p];
        }
    }
}
