package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
                if (dirs[j] == 'S') {
                    continue;
                }
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    dirs[j] = 'S';
                    totalCollision += 2;
                } else {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }

    
}