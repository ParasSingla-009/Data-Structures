package com.OOPS.OOP6.General;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        arr.forEach((item) -> System.out.println(item * 2));

    }

    int sum(int a, int b){
        return  a +  b;
    }
}
