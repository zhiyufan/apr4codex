package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'S') {
                continue;
            }
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == 'L' && chars[j] == 'R') {
                    result++;
                }
                if (chars[i] == 'R' && chars[j] == 'L') {
                    result += 2;
                }
            }
        }
        return result;
    }

    
}