package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        boolean occupied = false;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S') {
                occupied = true;
                i--;
            }
            else if (!occupied) {
                for (int j = 0; j < directions.length(); j++) {
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S')) {
                        collisions += 2;
                        occupied = true;
                        i--;
                        break;
                    }
                }
            }
            else if (occupied) {
                occupied = false;
            }
        }
        return collisions;
    }

    
}