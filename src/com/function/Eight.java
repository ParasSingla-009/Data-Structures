package com.function;

import java.util.Scanner;

public class Eight {
    static int Natural(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Natural(n);
        System.out.println(ans);
        }
    }

