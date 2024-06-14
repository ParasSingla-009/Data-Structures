package com.MathsforDSA;
// given a num find it is odd or even
public class Q1 {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }

}
