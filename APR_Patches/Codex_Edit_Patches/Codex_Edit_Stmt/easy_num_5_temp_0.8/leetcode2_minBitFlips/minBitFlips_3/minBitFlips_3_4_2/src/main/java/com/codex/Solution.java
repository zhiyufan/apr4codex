package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        

        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        int slen = s.length();
        int glen = g.length();
        if (slen > glen) {
            return -1;
        }

        int p1 = slen - 1;
        int p2 = glen - 1;
        int res = 0;
        boolean flip = false;
        while (p1 >= 0 && p2 >= 0) {
            if (s.charAt(p1) != g.charAt(p2)) {
                if (!flip) {
                    flip = true;
                    res++;
                }
            } else {
                if (flip) {
                    flip = false;
                }
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
    //Fix "String s = Integer.toBinaryString(start);"
        public static int minBitFlips(int start, int goal) {

        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        int slen = s.length();
        int glen = g.length();
        if (slen > glen) {
            return -1;
        }

        int p1 = slen - 1;
        int p2 = glen - 1;
        int res = 0;
        boolean flip = false;
        while (p1 >= 0 && p2 >= 0) {
            char c1 = s.charAt(p1);
            char c2 = g.charAt(p2);
            if (c1 != c2) {
                if (!flip) {
                    flip = true;
                    res++;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p1--;
            p2--;
        }

        if (p1 >= 0) {
            if (!flip) {
                return res;
            } else if (s.charAt(p1) == '0') {
                return res;
            }
        }

        if (p2 >= 0) {
            if (!flip) {
                return res;
            }
            if (g.charAt(p2) == '0') {
                return res;
            }
        }

        return res;
    }
    }

    
}