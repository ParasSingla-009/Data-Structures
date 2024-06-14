package com.Arrays;

import java.util.Scanner;

public class Third {
    public static int wealth(int[][] accounts){
        int maxwealth = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(wealth > maxwealth){
                maxwealth = wealth;
            }
        }
        return maxwealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int [m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0; j<n; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        int ans = wealth(accounts);
        System.out.println(ans);
    }
}
