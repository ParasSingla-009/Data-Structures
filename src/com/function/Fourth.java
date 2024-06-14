package com.function;

import java.util.Scanner;

public class Fourth {
    static int product (int a, int b){
        return a *  b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int c = sc.nextInt();
        System.out.println("Enter Second Number");
        int d = sc.nextInt();
        int ans = product(c, d);
        System.out.println(ans);
    }
}

