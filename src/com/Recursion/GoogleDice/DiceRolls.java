package com.Recursion.GoogleDice;

import java.util.ArrayList;

public class DiceRolls {
    public static void main(String[] args) {
        Dice(" ", 4);
        System.out.println(DiceRet(" ", 4));
    }
    public static void Dice(String processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i<= target; i++) {
            Dice(processed+i, target-i);
        }

    }

    public static ArrayList<String> DiceRet(String processed, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i<= target; i++) {
            list.addAll(DiceRet(processed+i, target-i));
        }
        return list;
    }
}
