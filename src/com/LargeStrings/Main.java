package com.LargeStrings;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();
        //constructor 2
        StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        sb.append("Paras Singla");
        sb.append(" is nice!");
        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        // remove whitespaces
        String sentence = "Hi h hh jhj jkl mnq";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        // split
        String arr = "Kunal Apporv Rahul";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));

    }
}
