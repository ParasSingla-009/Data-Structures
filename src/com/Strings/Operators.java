package com.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println('a' + 'b' + 'c');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(560));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
