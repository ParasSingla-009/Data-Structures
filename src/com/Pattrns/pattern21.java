package com.Pattrns;

public class pattern21 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%-3d",number);
                number++;
            }
            System.out.println();
        }
    }
}
