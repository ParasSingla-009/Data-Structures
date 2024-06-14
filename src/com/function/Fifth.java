package com.function;

import java.util.Scanner;

public class Fifth {
    static double circle(int r){
        double pi = 3.14;
        System.out.println(pi * r * r );
        return 2 * pi *r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double ans = circle(r);
        System.out.println(ans);
    }
}
