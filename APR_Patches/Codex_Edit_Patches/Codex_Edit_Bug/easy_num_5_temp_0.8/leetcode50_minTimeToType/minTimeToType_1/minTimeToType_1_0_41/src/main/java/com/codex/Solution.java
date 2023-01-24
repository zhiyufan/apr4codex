package com.codex;

import java.util.*;

public class Solution {
  
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));

    public static int minTimeToTypeBetter(String word) {

        int res = 0;
        int cur = 1;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(ch - cur), 26 - Math.abs(ch - cur));
            cur = ch;
        }
        return res;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}