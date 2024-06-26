package com.Recursion.Permutations;

import java.util.ArrayList;

//
public class Q1 {
    public static void main(String[] args) {
        System.out.println(permutationsCount("", "abc"));
        ArrayList<String> ans = permutations2("", "abc");
        System.out.println(ans);
    }
    static void permutations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            permutations(first+ch+second, unprocessed.substring(1));
        }

    }


    static ArrayList<String> permutations2(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            ans.addAll(permutations2(first+ch+second, unprocessed.substring(1)));
        }
        return ans;

    }

    static int permutationsCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            count = count + permutationsCount(first+ch+second, unprocessed.substring(1));
        }
        return count;

    }
}
