package com.LinearSearch;

public class String2 {
    public static void main(String[] args) {
        String name = "Paras";
        char target = 'r';
        System.out.println(Search(name, target));
    }
    static boolean Search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
