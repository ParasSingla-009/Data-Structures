package com.Pattrns;

public class pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<(2*i)-1; k++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print the first asterisk
            System.out.print("*");

            // Print spaces between asterisks
            for (int k = 1; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }

            // For rows greater than 1, print the last asterisk
            if (i > 1) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
