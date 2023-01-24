package com.codex;

import java.util.*;

public class Solution {
public static int minTimeToType(String word) {
        int res = 0;

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0;
        for (char ch : word.toCharArray()) {
            res += Math.abs(pos[ch - 'a'] - cur);
            if (cur > pos[ch - 'a']) {
                res += 26;
            }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}