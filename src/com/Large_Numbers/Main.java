package com.Large_Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BD();
    }

        static void BD(){
            double x = 0.03;
            double y = 0.04;
           // double ans = y-x;


            BigDecimal X = new BigDecimal("0.03");
            BigDecimal Y = new BigDecimal("0.04");
            BigDecimal ans = Y.subtract(X);
            System.out.println(ans);
        }

        static void BI() {
            int a = 30;
            int b = 67;

            BigInteger A = BigInteger.valueOf(33);
            BigInteger B = BigInteger.valueOf(56665164); // int to BI Converter
            int c = B.intValue();// Bi to int converter
            BigInteger C = new BigInteger("2358947");
            BigInteger X = new BigInteger("56515615616111");
            //constants
            BigInteger D = BigInteger.ONE;
            // addition
            BigInteger s = C.add(X);
            BigInteger m = C.multiply(X);

            if (C.compareTo(X) < 0) {
                System.out.println("Yes");
            }

            System.out.println(m);
            System.out.println(Factorial.fact(100));
        }


}
