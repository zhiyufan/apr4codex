package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int len = directions.length();
        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
                collisions += 2;
            } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
                collisions++;
                j--;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
                collisions += 2;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {                
                collisions++;
                j--;
            }
            i++;

        }

        return collisions;
    }

    
}