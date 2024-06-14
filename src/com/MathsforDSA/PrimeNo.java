package com.MathsforDSA;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
