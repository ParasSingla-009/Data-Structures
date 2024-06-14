package com.MathsforDSA.Leetcode;

public class L4 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        int num = 12;
        String num2 = String.valueOf(num);
        for(int i=num2.length()-1; i>=0; i--){
            string.append(num2.charAt(i));
        }
        String num3 = string.toString();
        int num4 = Integer.parseInt(num3);
        if(num4 > num){
            
        }
    }
}
