package com.MathsforDSA;

public class L3 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = new int[n + 1];
        for(int i=1; i<=n; i++){
            result[i] = result[i >> 1] + (i & 1);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
