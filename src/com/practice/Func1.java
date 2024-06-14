package com.practice;

import java.util.Scanner;

public class Func1 {
        static void sum() {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a+b));
        }
        static int sum2(int a, int b){
            int sum = a + b;
            return sum;
        }

    public static void main(String[] args) {
        int ans = sum2(10, 20);
        System.out.println(ans);

    }
    }

