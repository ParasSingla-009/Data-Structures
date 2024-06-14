package com.MathsforDSA;
// Set the ith bit
public class Q4 {
    public static void main(String[] args) {
        System.out.println(seti(86, 4));
    }
    public static int seti(int n, int i){
        return(n | (1 << (i-1)));
    }
}
