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



    public static int decide(int x, int cur, int pos[]) {
        if (cur == x) {
            return 0;
        }
        int mx = Math.max(x, cur);
        int mn = Math.min(x, cur);
        int up = 0;
        int down = 0;
        for (int i = mn + 1; i <= mx; ++i) {
            if (i != cur) {
                ++down;
            }
            ++up;
        }
        return Math.min(down, up);
    }

    public static int minTimeToType(String s) {
        int pos[] = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            pos[ch - 'a'] = i++;
        }
        int cur = 0;
        int time = 0;
        for (char ch : s.toCharArray()) {
            time += decide(pos[ch - 'a'], cur, pos);
            cur = pos[ch - 'a'];
        }
        return time;
    }

            cur = pos[ch - 'a'];
        }
        return res;
    }
}