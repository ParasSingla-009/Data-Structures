package com.practice;

import java.util.Scanner;

public class AOET {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the side of Equilateral Triangle");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)/4) * a * a;
        System.out.println(area);
    }
}
