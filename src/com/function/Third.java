package com.function;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Third {
    static int sum (int a, int b){
        return a +  b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int c = sc.nextInt();
        System.out.println("Enter Second Number");
        int d = sc.nextInt();
        int ans = sum(c, d);
        System.out.println(ans);
    }
}
