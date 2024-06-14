package com.practice;

import java.util.Scanner;

public class First5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        } else if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println(b);
        }
    }
}
