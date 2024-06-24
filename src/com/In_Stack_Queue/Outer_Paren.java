package com.In_Stack_Queue;
import java.util.Stack;

public class Outer_Paren {
    static public String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(bracket.size() > 0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            } else {
                bracket.pop();
                if(bracket.size() >0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
