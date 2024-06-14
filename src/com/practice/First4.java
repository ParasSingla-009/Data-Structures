package com.practice;

import java.util.Scanner;

public class First4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pali = sc.nextLine();
        String news = "";
        for(int i=pali.length()-1; i>=0; i--){
            news = news + pali.charAt(i);
        }
        if(pali.equals(news)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
