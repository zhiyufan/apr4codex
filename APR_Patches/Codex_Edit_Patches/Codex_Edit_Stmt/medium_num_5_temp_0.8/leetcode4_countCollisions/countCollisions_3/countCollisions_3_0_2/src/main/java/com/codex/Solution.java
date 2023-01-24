package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        if (directions == null || directions.length() == 0) {
            return 0;
        }

        int sum = 0;
        int i = 0;
        int j = directions.length() - 1;
        while (i < j) {
            if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
                sum += 2;
            } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
                sum++;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
                sum += 2;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
                sum++;
            }
            i++;
            j--;
        }

        return sum;
    }

    
}