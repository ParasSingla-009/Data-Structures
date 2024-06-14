package com.function;

import java.util.Arrays;

public class Ninth {
    static boolean isTriplet(int arr[], int n){
            for(int i=0; i<n; i++){
                arr[i] = arr[i] * arr[i];
            }
            Arrays.sort(arr);
            for(int i= n-1; i>=2; i--){
                int l =0;
                int r = n-1;
                while(l<r){
                    if(arr[l] + arr[r] == arr[i]){
                        return true;
                    }
                    if(arr[l] + arr[r] < arr[i]){
                        l++;
                    }
                    else {
                        r--;
                    }
                }
            }
            return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,4,6,5};
        int arr_size = arr.length;
        boolean ans = isTriplet(arr, arr_size);
        System.out.println(ans);
    }
}
