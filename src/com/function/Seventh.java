package com.function;

import java.util.Scanner;

public class Seventh {
    static int Fact(int n){
        if (n == 0){
            return 1;
        } else {
            return (n * Fact(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fact(n);
        System.out.println(ans);
    }
}
