package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        
        int result = 0;
        
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == 'S' && chars[j] == 'S') {
                    result++;
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