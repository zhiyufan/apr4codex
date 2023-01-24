package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
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
=======
    public boolean isTandemRepeat() {
        String str = this.n;
        if (str.length() % 2 != 0) {
            return false;
        }
        int len = str.length() / 2;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(i + len)) {
                return false;
            }
        }
        return true;
    }
>>>>>>> Stashed changes

    
}