package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        int p1 = 0;
        int p2 = 0;
        int flips = 0;
        while (p1 <= Math.log(start) / Math.log(2) && p2 <= Math.log(goal) / Math.log(2)) {
            int v1 = (start >> p1) & 1;
            int v2 = (goal >> p2) & 1;
            if (v1 == v2) {
                p1++;
                p2++;
            } else {
                p2++;
                flips++;
            }
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