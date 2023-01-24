package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length - 1; i++) {
                int j = i + 1;
                    if (chars[i] == 'S' && chars[j] == 'S') {
                        result++;
                    } else if (chars[i] == 'L' && chars[j] == 'R') {
                        result++;
                    } else if (chars[i] == 'R' && chars[j] == 'L') {
                        result += 2;
                    }
                }
        }
        return result;
    }

    
}