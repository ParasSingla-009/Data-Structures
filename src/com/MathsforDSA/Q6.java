package com.MathsforDSA;
// reset the ith bit
public class Q6 {
    public static void main(String[] args) {
        System.out.println(reseti(86, 5));
    }
    public static int reseti(int n, int i){
        return(n & ~(1 << (i-1)));
    }
}

