package com.MathsforDSA;
// No od Digits in Binary Representation
public class Q10 {
    public static void main(String[] args) {
        int n =6;
        int b = 2;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
