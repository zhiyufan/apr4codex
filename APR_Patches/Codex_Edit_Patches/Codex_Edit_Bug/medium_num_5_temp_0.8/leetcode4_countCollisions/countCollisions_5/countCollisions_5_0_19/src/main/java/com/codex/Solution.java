package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static int countCollisions(String directions) {

        int collisions = 0, i = 0;
        for (; i < directions.length(); i++) {
            if (directions.charAt(i) != 'S') {
                String temp = directions.substring(i + 1);
                if (temp.contains(directions.substring(i, i + 1))) {
                    collisions += 1;
                }
                if (temp.contains("S")) {
                    collisions += 1;
                }
                directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
            }

        }
        return collisions;
    }

    
}