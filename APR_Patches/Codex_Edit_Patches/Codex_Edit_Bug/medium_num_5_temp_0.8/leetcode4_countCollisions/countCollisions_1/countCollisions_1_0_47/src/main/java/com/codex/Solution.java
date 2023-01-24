package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    result++;
                } else if (chars[i] + chars[j] == 'L' + 'R') {
                    result++;
                } else if (chars[i] + chars[j] == 'R' + 'L') {
                    result += 2;
                }
            }
        }
        return result;
    }

    
}