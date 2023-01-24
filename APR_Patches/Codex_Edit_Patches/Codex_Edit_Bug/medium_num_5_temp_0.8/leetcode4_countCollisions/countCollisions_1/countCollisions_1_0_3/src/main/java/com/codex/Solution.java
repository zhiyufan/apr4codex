package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        int checker = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                checker = 0;
                if (chars[i] == 'S' && chars[j] == 'S') {

                    if (chars[j + 1] == 'S' || chars[j - 1] == 'S') {
                        checker = 1;

                    }
                    if (checker == 0) {
                        result++;
                    }
                } else if (chars[i] == 'L' && chars[j] == 'R') {
                    if (chars[j + 1] == 'L' || chars[j - 1] == 'R') {
                        checker = 1;

                    }
                    if (checker == 0) {
                        result++;
                    }
                } else if (chars[i] == 'R' && chars[j] == 'L') {
                    if (chars[j + 1] == 'R' || chars[j - 1] == 'L') {
                        checker = 1;

                    }
                    if (checker == 0) {
                        result += 2;
                    }
                }
            }
        }
        return result;
    }

    
}