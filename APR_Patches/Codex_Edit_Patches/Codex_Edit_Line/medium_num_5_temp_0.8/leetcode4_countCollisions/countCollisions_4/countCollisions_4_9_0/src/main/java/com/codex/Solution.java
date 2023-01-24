package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countCollisions("NSNSNSNS"));
    }
    
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length -1; i++) {
            for (int j = i+1; j < dirs.length - 1; j++) {
                
                if (dirs[i] == dirs[j]) {
                    
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        totalCollision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else {
                        totalCollision += 1;
                        if (dirs[i] != 'S') {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}