package com.practice;

import java.util.Scanner;

public class POC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        double perimeter = 2 * pi * r;
        System.out.println(perimeter);
    }
}
