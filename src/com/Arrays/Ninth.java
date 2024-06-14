package com.Arrays;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] gain = {-5, 1, 5, 0, -7};
//        for(int i=0; i<n; i++){
//            gain[i] = sc.nextInt();
//        }
        int max = 0;
        int alti = 0;
        for(int i=0; i<gain.length; i++) {
            alti += gain[i];
            if (alti > max) {
                max = alti;
            }
        }
        System.out.println(max);
    }

}
