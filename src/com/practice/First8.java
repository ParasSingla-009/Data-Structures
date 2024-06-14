package com.practice;

import java.util.Scanner;

public class First8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstterm = 0;
        int secondterm = 1;
        for(int i=0; i<=n; i++){
            System.out.println(firstterm + ",");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}
