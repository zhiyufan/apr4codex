package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

        int totalCollisions = 0;

        char[] dir = directions.toCharArray();
        int N = dir.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (dir[i] != dir[j]) {
                    if (dir[i] == 'S' && dir[j] == 'S') {
                        totalCollisions += 1;
                    } else {
                        totalCollisions += 2;
                    }
                    dir[i] = 'S';
                    dir[j] = 'S';
                } else {
                }
            }
        }

        return totalCollision;
    }

    
}