package com.Recursion;

public class Fibonacchi {
    public static void main(String[] args) {;
        System.out.println(fibo(10));
        }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int fiboformula(int n){
        double v = (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) /  Math.sqrt(5));
        return (int)v;
    }

}
