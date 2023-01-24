package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        totalCollision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                        totalCollision += 1;
                        dirs[j] = 'S';
                    }
                    else {
                        totalCollision += 1;
                        dirs[i] = 'S';
                    }
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}