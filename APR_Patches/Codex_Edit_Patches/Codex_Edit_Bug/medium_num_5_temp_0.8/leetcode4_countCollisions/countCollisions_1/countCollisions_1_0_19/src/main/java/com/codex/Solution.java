package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions)throws Exception {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < directions.length(); i++) {
            for (int j = 0; j < directions.length(); j++) {
                if (i == j) {
                    continue;
                }
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