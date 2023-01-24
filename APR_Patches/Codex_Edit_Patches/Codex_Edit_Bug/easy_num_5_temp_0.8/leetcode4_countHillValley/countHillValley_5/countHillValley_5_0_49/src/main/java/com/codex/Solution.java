package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Program {
    public static List<String> findPaths(int[][] maze) {
        List<String> paths = new ArrayList<>();
        return paths;
    }
    public static void moveRight(int[][] maze, int r, int c, List<String> paths, String psf){
        while(c+1 < maze[0].length && maze[r][c+1] !=1){
            c++;
        }
        if(maze[r][c] == 9){
            paths.add(psf+"r");
        }
        moveDown(maze, r, c, paths, psf+"r");
    }

    public static void moveDown(int[][] maze, int r, int c, List<String> paths, String psf){
        while(r+1 < maze.length && maze[r+1][c] !=1){
            r++;
        }
        if(maze[r][c] == 9){
            paths.add(psf+"d");
        }
        moveLeft(maze, r, c, paths, psf+"d");
    }
    public static void moveLeft(int[][] maze, int r, int c, List<String> paths, String psf){
        while(c-1 >= 0 && maze[r][c-1] !=1){
            c--;
        }
        if(maze[r][c] == 9){
            paths.add(psf+"l");
        }
        moveUp(maze, r, c, paths, psf+"l");
    }
    public static void moveUp(int[][] maze, int r, int c, List<String> paths, String psf){
        while(r-1 >= 0 && maze[r-1][c] !=1){
            r--;
        }
        if(maze[r][c] == 9){
            paths.add(psf+"u");
        }
    }
}
}