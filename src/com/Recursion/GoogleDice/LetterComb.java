package com.Recursion.GoogleDice;

import java.util.ArrayList;

public class LetterComb {
    public static void main(String[] args) {
        pad(" ", "12");
    }
    static void pad(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0';
        for (int i = (digit -1) *3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            pad(processed+ch, unprocessed.substring(1));
        }
    }

    static ArrayList<String> padRet(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> list = new  ArrayList<>();
        for (int i = (digit -1) *3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(processed+ch, unprocessed.substring(1)));
        }
        return list;
    }
}
