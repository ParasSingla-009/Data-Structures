package com.Pattrns;

public class pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=(2*i)-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
