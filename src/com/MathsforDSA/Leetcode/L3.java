package com.MathsforDSA.Leetcode;

public class L3 {
    public static void main(String[] args) {
        int hour  = 10;
        int minutes = 46;
        double h = (hour%12 * 30) + ((double)minutes * 0.5);
        double m = minutes * 6;
        double angle = Math.abs(m-h);
        if(angle>180) angle = 360.0 - angle;
        System.out.println(angle);
    }
}
