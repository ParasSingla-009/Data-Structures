package com.practice;

public class func2 {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }

    public static void main(String[] args) {
        swap(10, 20);
    }
}
