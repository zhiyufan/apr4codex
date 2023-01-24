package com.codex;

import java.util.*;

public class Solution {
    public  int minTimeToType(String word) {
        // int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos.put(ch, i++);
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos.get(ch) - cur), 26 - Math.abs(pos.get(ch) - cur));
            cur = pos.get(ch);
        }
        return res;
    }
}