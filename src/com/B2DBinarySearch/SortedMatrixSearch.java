package com.B2DBinarySearch;

import java.util.Arrays;

public class SortedMatrixSearch {


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(arr, 10)));
    }
    static int[] search(int[][] matrix, int target){
        int r = matrix.length;
        int c = matrix[0].length;
        while(r<matrix.length && c >= 0){
            if(matrix[r][c] == target)
                return new int[]{r, c};
            if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return new int[]{-1, -1};
    }
}
