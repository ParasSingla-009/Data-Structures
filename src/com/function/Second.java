package com.function;

public class Second {
    static String vote(int a){
        if(a >= 18){
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }
    }

    public static void main(String[] args) {
        String ans = vote(15);
        System.out.println(ans);
    }
}
