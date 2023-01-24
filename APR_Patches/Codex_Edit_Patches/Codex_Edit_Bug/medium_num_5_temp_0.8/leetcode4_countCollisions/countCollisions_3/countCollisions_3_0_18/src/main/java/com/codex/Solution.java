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
            if (directions.charAt(i) != directions.charAt(j)) {
                collisions += 1;
            }
            i++;
            j--;
        }

        return collisions;
    }
    
}