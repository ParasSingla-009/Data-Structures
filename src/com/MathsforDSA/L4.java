package com.MathsforDSA;

public class L4 {
    public static void main(String[] args) {
        int x = 1;
        int y= 4;
        int count = 0;
        String Bx = Integer.toBinaryString(x);
        String By = Integer.toBinaryString(y);
        System.out.println(Bx);
        System.out.println(By);
        char[] ch1 = Bx.toCharArray();
        char[] ch2 = By.toCharArray();
        for(int i=0; i<ch1.length; i++){
            for(int j=0; j<ch2.length; j++){
                if(ch1[i] != ch2[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
