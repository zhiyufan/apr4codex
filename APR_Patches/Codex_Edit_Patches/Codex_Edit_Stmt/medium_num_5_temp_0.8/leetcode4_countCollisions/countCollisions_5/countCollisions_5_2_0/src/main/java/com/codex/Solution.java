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
                for (int j = 0; j < directions.length(); j++) {
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S')) {
                        collisions += 2;
                        directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                        directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                        i--;
                        break;
                    }
                }
            }
        }
        return collisions;
    
       
       
       
       
       
       
       
       
       
       
       
       
       
    }

    public static int countCollisions(String directions) {
        directions = removeS(directions);
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            for (int j = 0; j < directions.length(); j++) {
                if (directions.charAt(i) != directions.charAt(j)) {
                    collisions += 2;
                    directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                    directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                    i--;
                    break;
                }

            }
        }
        return collisions;
    }

    public static String removeS(String directions) {
        int index = directions.indexOf('S');
        while (index != -1) {
            directions = directions.substring(0, index) + directions.substring(index + 1);
            index = directions.indexOf('S');
        }
        return directions;
    }
}