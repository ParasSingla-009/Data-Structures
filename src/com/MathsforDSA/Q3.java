package com.MathsforDSA;
// find ith bit of a no.
public class Q3 {
    public static void main(String[] args) {
        System.out.println(findi(182, 5));
    }
    public static int findi(int n, int i){
        if( (n & (1 << (i-1))) != 0){
            return 1;
        } else {
            return 0;
        }
    }
}
