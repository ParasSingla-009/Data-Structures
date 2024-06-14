package com.Strings.Questions;
// Shuffle String Leetcode Q1528
public class ShuffleStirng {
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        int length = s.length();
        StringBuilder sb = new StringBuilder("");
        char c[] = new char[length];
        for(int i=0; i<indices.length; i++){
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        System.out.println(sb.toString());
    }
}

