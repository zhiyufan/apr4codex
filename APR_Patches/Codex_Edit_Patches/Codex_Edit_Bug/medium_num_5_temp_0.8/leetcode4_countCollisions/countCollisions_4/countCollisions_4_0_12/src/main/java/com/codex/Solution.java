package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
                int collision = 0;
                if (dirs[i] == dirs[j]) {
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        collision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else {
                        collision += 1;
                        if (dirs[i] != 'S') {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                    if (collision == 2)
                        break;
                }
            }
        }

        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                int collision = 0;
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        collision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else {
                        collision += 1;
                        if (dirs[i] != 'S') {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                    break;
                }
                if (collision == 2)
                    break;
            }
        }

        return totalCollision;
    }

    
}