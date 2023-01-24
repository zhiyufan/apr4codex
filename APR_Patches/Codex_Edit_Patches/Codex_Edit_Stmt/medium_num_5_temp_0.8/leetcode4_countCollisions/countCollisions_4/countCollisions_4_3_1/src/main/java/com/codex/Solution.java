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
                    if (!Character.toString(dirs[i]).equals("S") && !Character.toString(dirs[j]).equals("S")) {
                        totalCollision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    }
                    totalCollision += 1;
                    if (!Character.toString(dirs[i]).equals("S")) {
                        dirs[i] = 'S';
                    }
                    if (!Character.toString(dirs[j]).equals("S")) {
                        dirs[j] = 'S';
                    }

                    break;
                }
            }
        }

        return totalCollision;
    }

    
}