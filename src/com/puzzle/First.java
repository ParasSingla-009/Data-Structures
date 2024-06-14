package com.puzzle;

import java.util.Scanner;

public class First {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] accounts = {{2, 2}, {2, 3},{5,4}};

            // Calculate the maximum wealth
            int maxWealth = maximumWealth(accounts);

            // Output the maximum wealth
            System.out.println(maxWealth);
        }

        public static int maximumWealth(int[][] accounts) {
            int maxWealth = 0;
            for (int i = 0; i < accounts.length; i++) {
                int wealth = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    wealth += accounts[i][j];
                }
                maxWealth = Math.max(maxWealth, wealth);
            }
            return maxWealth;
        }
    }

