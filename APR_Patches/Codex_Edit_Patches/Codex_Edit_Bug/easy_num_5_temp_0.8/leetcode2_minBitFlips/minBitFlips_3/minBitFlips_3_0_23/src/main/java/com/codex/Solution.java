package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal, int index) {
        

        String s = Integer.toBinaryString(start & (1 << index) - 1);
        String g = Integer.toBinaryString(goal & (1 << index) - 1);

        int slen = s.length();
        int glen = g.length();
        if (slen > glen) {
            return -1;
        }

        int p1 = index - 1;
        int p2 = slen - 1;
        int res = 0;
        int flips = 0;
        while (p1 >= 0 && p2 >= 0) {
            if (p1 > p2 && start < goal) {
                int zeros = (1 << p1) - 1 - start;
                int ones = goal - start - zeros;
                flips += zeros;
                start += zeros;
                goal -= ones;
                if (zeros % 2 == 1) {
                    return -1;
                }

                res += flips % 2;
                flips = 0;
            }
            if (p1 < p2 && start < goal) {
                int zeros = (1 << p2) - 1 - start;
                int ones = goal - start - zeros;
                flips += zeros;
                start += zeros;
                goal -= ones;
                if (zeros % 2 == 1) {
                    return -1;
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
    }

    
}