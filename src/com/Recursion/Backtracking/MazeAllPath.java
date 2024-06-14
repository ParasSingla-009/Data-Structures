package com.Recursion.Backtracking;

import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathwAllPath("", board, 0, 0, path, 1);
    }
    static void pathwOb(String processed, boolean[][] maze, int row, int c){
        if(row == maze.length-1 && c == maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if(!maze[row][c]){
            return;
        }
        maze[row][c] = false;
        if(row < maze.length-1){
            pathwOb(processed+'D', maze, row+1, c);
        }
        if(c < maze[0].length-1){
            pathwOb(processed + 'R', maze, row, c+1);
        }
        if(row>0){
            pathwOb(processed+'U', maze, row-1, c);
        }
        if(c > 0){
            pathwOb(processed+'L', maze, row, c-1);
        }
        maze[row][c] = true;
    }

    static void pathwAllPath(String processed, boolean[][] maze, int row, int c, int[][]path, int step){
        if(row == maze.length-1 && c == maze[0].length-1){
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }
        if(!maze[row][c]){
            return;
        }
        maze[row][c] = false;
        path[row][c] = step;
        if(row < maze.length-1){
            pathwAllPath(processed+'D', maze, row+1, c, path, step+1);
        }
        if(c < maze[0].length-1){
            pathwAllPath(processed + 'R', maze, row, c+1, path, step+1);
        }
        if(row>0){
            pathwAllPath(processed+'U', maze, row-1, c, path, step+1);
        }
        if(c > 0){
            pathwAllPath(processed+'L', maze, row, c-1, path, step+1);
        }
        maze[row][c] = true;
        path[row][c] = 0;
    }
}
