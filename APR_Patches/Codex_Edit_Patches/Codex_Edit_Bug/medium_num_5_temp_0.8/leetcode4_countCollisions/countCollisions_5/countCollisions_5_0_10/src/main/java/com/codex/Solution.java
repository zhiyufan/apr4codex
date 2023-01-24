package com.codex;

import java.util.*;

public class Solution {
package dv;

public class Rabbits {
    
    public static void main(String[] args) {
        System.out.println(countCollisions("EESNSSEE"));
    }
    
    
    
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) != 'S') {
                for (int j = i + 1; j < directions.length(); j++) {
                    if (directions.charAt(i) != directions.charAt(j)) {
                        if (directions.charAt(j) != 'S') {
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
}