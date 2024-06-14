package com.Recursion.Backtracking;

public class MazePrintPath {
    public static void main(String[] args) {
        path("", 3,3);
    }
    static void path(String processed, int row, int c){
        if(row == 1 && c == 1){
            System.out.println(processed);
            return;
        }
        if(row>1){
            path(processed+'D', row-1, c);
        }
        if(c > 1){
            path(processed + 'R', row, c-1);
        }
    }

}
