package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

        int x = 0;
        int y = 0;
        int totalCollision = 0;

        char[] dirs = directions.toUpperCase().toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i] == dirs[j] && dirs[i] != 'S') {
                if (dirs[i] != 'S') {
                    dirs[i] = 'S';
                }
            }
        }

        return totalCollision;
    }

    
}