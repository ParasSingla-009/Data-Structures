package com.Pattrns;

public class pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((j + i) % 2 == 0) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}

