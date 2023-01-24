package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {

        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int i = 0;
        int j = directions.length() - 2;
        while (i < j) {
            if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L' && directions.charAt(j+1) == 'L') {
                collisions += 2;
            } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R' && directions.charAt(j+1) == 'R') {
                collisions++;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R' && directions.charAt(j+1) == 'R') {
                collisions += 2;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L' && directions.charAt(j+1) == 'L') {
                collisions++;
            }
            i++;
            j--;
        }

        return collisions;
    }
}