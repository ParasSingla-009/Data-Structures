package com.Pattrns;

public class pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1 && i< n){
                for(int k=1;k<=(2*i)-3; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == n) {
                for(int k=1; k<= (2*i)-1; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
