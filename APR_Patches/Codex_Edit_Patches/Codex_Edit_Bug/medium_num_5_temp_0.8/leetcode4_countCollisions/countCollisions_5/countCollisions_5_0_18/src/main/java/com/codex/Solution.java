package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        int collisions = 0;
        String changedDirections = "";
        
        for (int k = 0; k < directions.length(); k++) {
            for (int i = k; i < directions.length(); i++) {
                if (directions.charAt(i) == 'S') {
                    changedDirections += directions.charAt(i);
                    continue;
                }
                else {
                    for (int j = 0; j < directions.length(); j++) {
                        if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S'
                                && i != j && i < j)) {
                            collisions += 2;
                            changedDirections += 'S';
                            changedDirections += 'S';
                            break;
                        }
                        else if (i == j || i > j) {
                            changedDirections += directions.charAt(i);
                            break;
                        }
                        else {
                            changedDirections += directions.charAt(i);
                        }
                    }
                }
            }
        }
        return collisions;
    }

    
}