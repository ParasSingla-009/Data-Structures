package com.practice;

import java.util.Scanner;

public class AOT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int h = sc.nextInt();
        System.out.println("Enter base");
        int b = sc.nextInt();
        double a = b*h*0.5;
        System.out.println(a);

    }
}
