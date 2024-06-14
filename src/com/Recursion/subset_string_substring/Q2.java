package com.Recursion.subset_string_substring;

import java.util.ArrayList;

// print all subsequence of a given string
public class Q2 {
    public static void main(String[] args) {
        subsequence("", "abc");
        System.out.println(subsequenceR("", "abc"));
    }
    static void subsequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subsequence(processed+ch, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }

    static ArrayList<String> subsequenceR(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subsequenceR(processed+ch, unprocessed.substring(1));
        ArrayList<String> right = subsequenceR(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
