package com.practice;

import java.util.Scanner;

public class First7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int digits = 0;
        int sum = 0;
        int last = 0;
        temp = n;
        while (temp >0){
            temp = temp / 10;
            digits ++;
        }
        temp = n;
        while (temp >0){
            last = temp%10;
            sum += (Math.pow(last,digits));
            temp = temp / 10;
        }
        if(n==sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
