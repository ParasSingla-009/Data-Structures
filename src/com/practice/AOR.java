package com.practice;

import java.util.Scanner;

public class AOR {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        int w = sc.nextInt();
        System.out.println("Enter length");
        int l = sc.nextInt();
        int a = l*w;
        System.out.println(a);
    }
}
