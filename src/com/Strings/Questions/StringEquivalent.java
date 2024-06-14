package com.Strings.Questions;
// Letcode 1662 String Equivalent
public class StringEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for(int i=0; i<word1.length; i++){
            sb.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++){
            sb2.append(word2[i]);
        }
        if(sb.toString().equals(sb2.toString())){
            System.out.println("true");
        }
        System.out.println("false");
    }
}


