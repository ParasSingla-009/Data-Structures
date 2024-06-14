package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int temp = arr[i][left] ^ 1;
                arr[i][left] = arr[i][right] ^ 1;
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j] + " ");
                ;
            }
        }
    }
}

