package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int i = 0;
        int j = directions.length() - 1;
        while (i < j) {
            if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
                collisions += 2;
                i++;
                j--;
            } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
                collisions++;
                i++;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
                collisions += 2;
                i++;
                j--;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
                collisions++;
                j--;
            }
        }

        return collisions;
    }

    
}