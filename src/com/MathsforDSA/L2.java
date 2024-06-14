package com.MathsforDSA;

public class L2 {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
