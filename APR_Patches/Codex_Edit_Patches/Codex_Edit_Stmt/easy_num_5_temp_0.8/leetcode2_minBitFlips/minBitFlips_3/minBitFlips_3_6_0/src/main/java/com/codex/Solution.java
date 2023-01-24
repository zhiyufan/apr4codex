package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
    
    String s = Integer.toBinaryString(start);
    String g = Integer.toBinaryString(goal);
    int p1 = 0;
    int p2 = 0;
    int res = 0;
    boolean flipped = false;
    while (p1 < s.length() && p2 < g.length()) {
        if (s.charAt(p1) != g.charAt(p2)) {
            res++;
            flipped = !flipped;
        } else {
            if (flipped) {
                res++;
                flipped = false;
            }
        }
        p1++;
        p2++;
    }

    while (p1 < s.length()) {
        if (flipped && s.charAt(p1) == '1') {
            res++;
            flipped = false;
        }
        p1++;
    }
    while (p2 < g.length()) {
        if (flipped && g.charAt(p2) == '0') {
            res++;
            flipped = false;
        }
        p2++;
    }
    return res;
}
}