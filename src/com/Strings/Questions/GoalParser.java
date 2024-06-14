package com.Strings.Questions;
//Goal Parser Interpretation 1678
public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder sb = new StringBuilder(command.length());
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                sb.append('G');
            }
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    sb.append('o');
                    i++;
                }
                else {
                    sb.append("al");
                    i = i + 3;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
