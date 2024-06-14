package com.Recursion.Backtracking;

public class MazewObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathwOb("", board, 0, 0);
    }
    static void pathwOb(String processed, boolean[][] maze, int row, int c){
        if(row == maze.length-1 && c == maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if(!maze[row][c]){
            return;
        }
        if(row < maze.length-1){
            pathwOb(processed+'D', maze, row+1, c);
        }
        if(c < maze[0].length-1){
            pathwOb(processed + 'R', maze, row, c+1);
        }
    }
}
