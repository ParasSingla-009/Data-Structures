package com.Strings;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String("Kunal");
        String b = new String("Kunal");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
