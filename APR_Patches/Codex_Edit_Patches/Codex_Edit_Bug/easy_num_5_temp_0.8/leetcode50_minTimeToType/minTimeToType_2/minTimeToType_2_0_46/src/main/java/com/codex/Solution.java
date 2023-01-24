package com.codex;

import java.util.*;

public class Solution {
public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }
            // corretly implemented the math.abs and Math.min, the main reason is that the cur and next are negative values
            // and java by default will take the negative value and ignore the absolute value, ideally, the expected results
            // should have been -11 and not 11.

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
            int next = word.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}