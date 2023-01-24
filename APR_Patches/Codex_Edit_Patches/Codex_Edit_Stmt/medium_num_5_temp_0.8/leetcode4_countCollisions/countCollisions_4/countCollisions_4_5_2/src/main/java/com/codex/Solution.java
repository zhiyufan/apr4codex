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
                        dirs[j] = 'B';
                    } else {
                        totalCollision += 1;
                        if (dirs[i] == 'N') {
                            dirs[i] = 'E';
                        } else {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] == 'N') {
                            dirs[j] = 'E';
                        } else {
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