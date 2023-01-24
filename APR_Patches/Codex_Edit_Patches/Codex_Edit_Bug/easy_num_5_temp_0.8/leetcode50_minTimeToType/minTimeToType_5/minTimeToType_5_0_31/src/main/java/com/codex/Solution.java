package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minTimeToType(String word) {
        if (word == null || word.length() == 0) return 0;

        int res = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            res += Math.min(steps(word.charAt(i), word.charAt(i + 1)), steps(word.charAt(i + 1), word.charAt(i)));
        }
        return res;
    }

        return res;
    }

    private int steps(char c1, char c2) {
        int a = c1 - 'a', b = c2 - 'a';
        return Math.abs(a - b);
    }
}

    
}