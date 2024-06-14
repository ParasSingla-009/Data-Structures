package com.practice;

import java.util.Scanner;

public class SAOC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double pi = 3.14;
        double soc = (2*pi*r*h) + (2*pi*r*r);
        System.out.println(soc);
    }
}
