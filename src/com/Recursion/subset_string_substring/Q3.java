package com.Recursion.subset_string_substring;
// print ascii value of the character subset/subsequence
public class Q3 {
    public static void main(String[] args) {
        subsequenceAscii("", "abc");
    }
    static void subsequenceAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subsequenceAscii(processed + ch, unprocessed.substring(1));
        subsequenceAscii(processed, unprocessed.substring(1));
        subsequenceAscii(processed + (ch+0), unprocessed.substring(1));
    }
}
