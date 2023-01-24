package com.codex;

import java.util.*;

public class Solution {
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
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
                    } else {
                        totalCollision += 1;
                        if (dirs[i] != 'S') {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                }
            }
        }

        return totalCollision;
    }
}