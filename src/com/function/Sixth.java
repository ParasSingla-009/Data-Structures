package com.function;

import java.util.Scanner;

public class Sixth {
    static String Marks(int a){
        if(a>90){
            return "AA";
        } else if (a >= 81) {
            return "AB";
        } else if (a >= 71) {
            return "BB";
        } else if (a >= 61) {
            return "BC";
        } else if (a >= 51) {
            return "CD";
        } else if (a >= 41) {
            return "DD";
        } else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = Marks(a);
        System.out.println(ans);
    }
}
