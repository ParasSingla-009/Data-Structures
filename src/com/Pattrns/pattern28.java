package com.Pattrns;

public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 0; row < 2*n; row++){
            int totalcols = row > n ? 2*n-row:row;
            int noofspaces = n-totalcols;
            for (int i = 0; i < noofspaces; i++) {
                System.out.print(" ");
            }
            for(int col = 0; col< totalcols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
