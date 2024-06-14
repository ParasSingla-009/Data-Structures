package com.practice;

import java.util.Scanner;

public class First3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int intrest = sc.nextInt();
        int a = principal*intrest*time/100;
        System.out.println(a);

    }
}
