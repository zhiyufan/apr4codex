package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        boolean[] skip = new boolean[chars.length];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (skip[j]) {
                    continue;
                }
                if (chars[i] == 'S' && chars[j] == 'S') {
                    result++;
                } else if (chars[i] == 'L' && chars[j] == 'R') {
                    result++;
                } else if (chars[i] == 'R' && chars[j] == 'L') {
                    skip[j] = true;
                    result += 2;
                }
            }
        }
        return result;
    }

    
}