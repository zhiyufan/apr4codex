package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {

        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        int slen = s.length();
        int glen = g.length();
        for(int i = 0; i < slen; i++) {
            if (s.charAt(i) == '1') {
                return -1;
            }
        }
        int res = 0;
        boolean flip = false;
        for(int i = glen - 1; i >= 0; i--) {
            if (g.charAt(i) == '1') {
                flip = !flip;
            }
            p1--;
            p2--;
        }
        while (p2 >= 0) {
            if (g.charAt(p2) == '1') {
                if (!flip) {
                    flip = true;
                    res++;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p2--;
        }

        while (p1 >= 0) {
            if (s.charAt(p1) == '1') {
                if (!flip) {
                    return -1;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p1--;
        }
        return res;
    }

    
}