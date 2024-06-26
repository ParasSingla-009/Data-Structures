package com.Recursion.Backtracking;

import java.util.ArrayList;

public class MaxePrintpAthDiag {
    public static void main(String[] args) {
        System.out.println(PathRetDiag("", 3, 3));
    }
    static ArrayList<String> PathRetDiag(String processed, int r, int c){
        if(r==1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(PathRetDiag(processed + 'D', r-1, c-1));
        }
        if(r>1){
            list.addAll(PathRetDiag(processed + 'V', r-1, c));
        }
        if(c>1){
            list.addAll(PathRetDiag(processed + 'H', r, c-1));
        }
        return list;
    }
}
