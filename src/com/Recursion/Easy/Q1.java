package com.Recursion.Easy;
// print N to 1 numbers
public class Q1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
