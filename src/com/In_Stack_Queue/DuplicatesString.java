package com.In_Stack_Queue;
import java.util.Stack;
public class DuplicatesString {
    static public void removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.empty()){
                if(s.charAt(i) == stack.peek()){
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String s = "abbaca";
        removeDuplicates(s);
    }
}
