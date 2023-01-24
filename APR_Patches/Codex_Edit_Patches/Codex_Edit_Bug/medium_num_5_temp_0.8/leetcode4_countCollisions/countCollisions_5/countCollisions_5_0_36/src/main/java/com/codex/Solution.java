package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S') {
                directions = directions.substring(0, i) + directions.substring(i + 1);
                i--;
            }
            else {
                char a = directions.charAt(i);
                for (int j = i + 1; j < directions.length(); j++) {
                    if (directions.charAt(j) != 'S') {
                        if (a == directions.charAt(j)) {
                            collisions += 2;
                            directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                            directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                            i--;
                            break;
                        }else if (a == 'L' && directions.charAt(j) == 'R') {
                            collisions += 2;
                            directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                            directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                            i--;
                            break;
                        }
                    }
                }
            }
        }
        return collisions;
    }

    
}