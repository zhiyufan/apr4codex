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
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S') && ((directions.charAt(i) == '^' && directions.charAt(j) == '>') || (directions.charAt(i) == '^' && directions.charAt(j) == '<') || (directions.charAt(i) == 'v' && directions.charAt(j) == '<') || (directions.charAt(i) == 'v' && directions.charAt(j) == '>') || (directions.charAt(i) == '<' && directions.charAt(j) == '^') || (directions.charAt(i) == '<' && directions.charAt(j) == 'v') || (directions.charAt(i) == '>' && directions.charAt(j) == '^') || (directions.charAt(i) == '>' && directions.charAt(j) == 'v'))) {
                        collisions += 2;
                        if (directions.charAt(i) == '^') {
                            directions = directions.substring(0, i) + '>' + directions.substring(i + 1);
                        }
                        else if (directions.charAt(i) == '>') {
                            directions = directions.substring(0, i) + 'v' + directions.substring(i + 1);
                        }
                        else if (directions.charAt(i) == 'v') {
                            directions = directions.substring(0, i) + '<' + directions.substring(i + 1);
                        }
                        else if (directions.charAt(i) == '<') {
                            directions = directions.substring(0, i) + '^' + directions.substring(i + 1);
                        }
                        if (directions.charAt(j) == '^') {
                            directions = directions.substring(0, j) + '>' + directions.substring(j + 1);
                        }
                        else if (directions.charAt(j) == '>') {
                            directions = directions.substring(0, j) + 'v' + directions.substring(j + 1);
                        }
                        else if (directions.charAt(j) == 'v') {
                            directions = directions.substring(0, j) + '<' + directions.substring(j + 1);
                        }
                        else if (directions.charAt(j) == '<') {
                            directions = directions.substring(0, j) + '^' + directions.substring(j + 1);
                        }
                        i--;
                        break;
                    }
                }
            }
        }
        return collisions;
    }

    
}