package com.function;

public class First {
    static String Even(int a){
        if (a % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String ans = Even(13);
        System.out.println(ans);
    }
}
