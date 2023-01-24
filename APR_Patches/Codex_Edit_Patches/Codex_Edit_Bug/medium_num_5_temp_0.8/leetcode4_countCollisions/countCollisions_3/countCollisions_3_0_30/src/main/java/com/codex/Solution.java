package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
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




        int hash = 13;
        String s = "abc";

        for(int i = 0; i < s.length(); i++)
        {
            hash = hash * 31 + s.charAt(i);
        }

        // hash value of "abc" according to the algorithm is 96354
        System.out.println(hash);
        return collisions;
    }

    
}