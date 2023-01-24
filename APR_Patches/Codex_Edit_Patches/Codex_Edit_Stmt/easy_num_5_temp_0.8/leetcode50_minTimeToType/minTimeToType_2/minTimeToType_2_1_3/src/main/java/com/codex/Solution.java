package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length(), cur = 0;

        for (int i = 0; i < len; i++) {
            int next = word.charAt(i) - 'a';
            res += (next - cur + 26) % 26;
            cur = next;
        }

        return res;
    }

    
}