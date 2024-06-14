package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        int[][] indices = {{0,1}, {1,1}};
        for(int i=0; i<indices.length; i++){
            int[] index = indices[i];
            int row = index[0];
            int column = index[1];

            for(int j = 0; j<n; j++){
                matrix[row][j]++;
            }
            for(int j=0; j<m; j++){
                matrix[j][column]++;
            }
        }

        int oddc = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] % 2 != 0){
                    oddc++;
                }
            }
        }

        System.out.println(oddc);
    }
}
