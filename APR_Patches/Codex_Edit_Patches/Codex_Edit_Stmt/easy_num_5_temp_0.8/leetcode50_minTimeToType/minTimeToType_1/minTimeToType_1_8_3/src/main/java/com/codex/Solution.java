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


    public static int minTimeToType2(String word) {
        int[] pos = new int[26];
        pos['a' - 'a'] = 0;
        pos['b' - 'a'] = 1;
        pos['c' - 'a'] = 2;
        pos['d' - 'a'] = 3;
        pos['e' - 'a'] = 4;
        pos['f' - 'a'] = 5;
        pos['g' - 'a'] = 6;
        pos['h' - 'a'] = 7;
        pos['i' - 'a'] = 8;
        pos['j' - 'a'] = 9;
        pos['k' - 'a'] = 10;
        pos['l' - 'a'] = 11;
        pos['m' - 'a'] = 12;
        pos['n' - 'a'] = 13;
        pos['o' - 'a'] = 14;
        pos['p' - 'a'] = 15;
        pos['q' - 'a'] = 16;
        pos['r' - 'a'] = 17;
        pos['s' - 'a'] = 18;
        pos['t' - 'a'] = 19;
        pos['u' - 'a'] = 20;
        pos['v' - 'a'] = 21;
        pos['w' - 'a'] = 22;
        pos['x' - 'a'] = 23;
        pos['y' - 'a'] = 24;
        pos['z' - 'a'] = 25;
        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}