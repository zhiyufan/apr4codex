package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        boolean moving;
        for (int i = 0; i < directions.length();) {
            moving = true;
            while (moving && i < directions.length()) {
                moving = false;
                for (int j = 0; j < directions.length(); j++) {
                    if (directions.charAt(i) != 'S' && directions.charAt(i) != directions.charAt(j)) {
                        collisions += 2;
                        directions = directions.substring(0, j) + 'S' + directions.substring(j + 1, i) + 'S' + directions.substring(i + 1);
                        moving = true;
                        j = i;
                    }
                }
                if (directions.charAt(i) == 'S') {
                    directions = directions.substring(0, i) + directions.substring(i + 1);
                    moving = false;
                }
            }
            if (!moving) {
                i = Math.min(i, directions.length());
            }
            else {
                i++;
            }
            
        }
        return collisions;
    }

    
}