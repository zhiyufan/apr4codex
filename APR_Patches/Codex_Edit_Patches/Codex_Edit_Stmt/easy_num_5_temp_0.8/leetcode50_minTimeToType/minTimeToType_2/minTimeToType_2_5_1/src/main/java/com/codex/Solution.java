package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0;
        int len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
            res += Math.min(Math.abs(word.charAt(i) - cur), 26 - Math.abs(word.charAt(i) - cur));
            cur = word.charAt(i);
        }

        return res;
    }

    
}