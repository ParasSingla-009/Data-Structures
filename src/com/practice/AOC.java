package com.practice;

import java.util.Scanner;

public class AOC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of Circle");
        double pi = 3.14;
        double a = pi * r* r;
        System.out.println(a);
    }
}
