package com.Strings.Questions;

public class SentenceSimilarityIII {
    public static void main(String[] args) {
        String sentence1 = "qbaVXO Msgr aEWD v ekcb";
        String sentence2 = "Msgr aEWD ekcb";
        String[] strArray1 = null;
        strArray1 = sentence1.split(" ");
        String[] strArray2 = null;
        strArray2 = sentence2.split(" ");
        if(strArray2[0].equals(strArray1[0])){
            System.out.println(true);;
        }
        if(strArray2[strArray2.length -1].equals(strArray1[strArray1.length-1])){
            System.out.println(true);
        }
        System.out.println(strArray1[0]);
        System.out.println(strArray2[0]);
    }
}
