package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollisions = 0;

        char[] directionsInChars = directions.toCharArray();
        for (int i = 0; i < directionsInChars.length; i++) {
            for (int j = i+1; j < directionsInChars.length; j++) {
                if (directionsInChars[i] == directionsInChars[j]) {
                    break;
                } else {
                    if (directionsInChars[i] != 'S' && directionsInChars[j] != 'S') {
                        totalCollisions += 2;
                        directionsInChars[i] = 'S';
                        directionsInChars[j] = 'S';
                    } else {
                        totalCollisions += 1;
                        if (directionsInChars[i] != 'S') {
                            directionsInChars[i] = 'S';
                        }
                        if (directionsInChars[j] != 'S') {
                            directionsInChars[j] = 'S';
                        }
                    }
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}