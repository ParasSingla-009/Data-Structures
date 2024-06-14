package com.MathsforDSA;
// you are given a number find out if it is power of 2 or not
public class Q12 {
    public static void main(String[] args) {
        int n =25;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
