package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int i = 0;
        int j = directions.length() - 1;
        boolean l = false;
        boolean r = false;
        while (i < j) {
            if (directions.charAt(i) == 'L') {
                l = true;
            }
            if (directions.charAt(j) == 'R') {
                r = true;
            }
            if (l && r) {
                collisions += 2;   
            }
            i++;
            j--;
        }

        return collisions;
    }

    
}