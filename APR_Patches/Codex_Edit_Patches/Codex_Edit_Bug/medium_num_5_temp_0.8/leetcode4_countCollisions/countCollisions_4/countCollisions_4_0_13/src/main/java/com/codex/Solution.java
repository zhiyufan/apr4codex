package com.codex;

import java.util.*;

public class Solution {
     public static int countCollisions(String directions) {
        
        int totalCollision = 0;

            if (dirs[i] == 'S') {
                continue;
            }
        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[j] == 'S') {
                    continue;
                }
                if (dirs[i] != dirs[j]) {
                    totalCollision += 1;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}