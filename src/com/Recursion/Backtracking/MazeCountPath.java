package com.Recursion.Backtracking;

public class MazeCountPath {
    public static void main(String[] args) {
        System.out.println(count(0,0, 3, 3));
    }
    static int count(int r, int c, int tr, int tc){
        if(r == tr-1 || c == tc-1){
            return 1;
        }
        int left = count(r+1, c, tr, tc);
        int rigth = count(r,c+1, tr, tc);

        return left+rigth;
    }
}
