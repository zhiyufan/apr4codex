package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int n = directions.length();
        int[] c = new int[4];

        for (int i = 0; i < n; i++) {
            if (directions.charAt(i) == 'L') {
                c[0]++;
            } else if (directions.charAt(i) == 'R') {
                c[1]++;
            } else if (directions.charAt(i) == 'U') {
                c[2]++;
            } else if (directions.charAt(i) == 'D') {
                c[3]++;
            }
        }
        collisions = Math.min(c[0], c[1]) + Math.min(c[2], c[3]);

        for (int i = 0; i < n; i++) {
            if (c[0] == c[1] && c[2] == c[3]) break;
            if (c[0] < c[1] || c[2] < c[3]) break;

            if (Math.abs(c[0] - c[1]) > Math.abs(c[2] - c[3])) {
                if (directions.charAt(i) == 'L') {
                    c[0]--;
                } else if (directions.charAt(i) == 'R') {
                    c[1]--;
                }
            } else {
                if (directions.charAt(i) == 'D') {
                    c[2]--;
                } else if (directions.charAt(i) == 'U') {
                    c[3]--;
                }
            }
            collisions++;
        }

        /*
        int i = 0;
        int j = directions.length() - 1;
        while (i < j) {
            if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
                collisions += 2;
            } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
                collisions++;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
                collisions += 2;
            } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
                collisions++;
            }
            i++;
            j--;
        }
         */

        return collisions;
    }
}