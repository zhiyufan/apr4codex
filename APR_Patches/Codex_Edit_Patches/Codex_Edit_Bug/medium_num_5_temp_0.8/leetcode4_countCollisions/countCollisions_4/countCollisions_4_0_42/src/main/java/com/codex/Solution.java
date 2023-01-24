package com.codex;

import java.util.*;

public class Solution {
public class PathCollision {
    public static void main(String[] args) {
       System.out.println ( countCollisions("WSWN"));
       System.out.println ( countCollisions("WWWN"));
       System.out.println ( countCollisions("NWWN"));
       System.out.println ( countCollisions("NNWN"));
       System.out.println ( countCollisions("NWNW"));
       System.out.println ( countCollisions("NNWW"));
       System.out.println ( countCollisions("NNNW"));
       System.out.println ( countCollisions("NNNN"));
    }
    
    public static int countCollisions(String path) {
        
        int totalCollision = 0;

        char[] dirs = path.toCharArray();
        for (int i = 0; i < dirs.length - 1; i++) {
            if (dirs[i] == dirs[i + 1]) {
                continue;
            } else {
                if (dirs[i] != 'S' && dirs[i + 1] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[i + 1] = 'S';
                } else {
                    totalCollision += 1;
                    if (dirs[i] != 'S') {
                        dirs[i] = 'S';
                    }
                    if (dirs[i + 1] != 'S') {
                        dirs[i + 1] = 'S';
                    } 
                }

            }
        }

        return totalCollision;
    }

    
}