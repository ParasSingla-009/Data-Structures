package com.MathsforDSA;
// Given a number n find the number of set bits
public class Q14 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        int count =0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
}
