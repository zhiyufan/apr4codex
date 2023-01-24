package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S') {
                directions = removeCharAt(directions, i);
            }
            else {
                for (int j = 0; j < directions.length(); j++) {
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S')) {
                        collisions += 2;
                        directions = removeCharAt(directions, i);
                        directions = removeCharAt(directions, j);
                        i--;
                        break;
                    }
                }
            }
        }
        return collisions;
    } 
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}