package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    if (chars[i] == 'S') {
                        result++;
                    } else if (chars[i] == 'L') {
                        result++;
                    } else if (chars[i] == 'R') {
                        result += 2;
                    }
                }
            }
        }
        return result;
    }

    
}