package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        /** There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
         * Return the maximum distance between two houses with different colors.
         * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
         */

        int res = 0, prevRed = -1, prevGreen = -1, prevBlue = -1;
        for(int i = 0; i < colors.length; i++) {
            if(colors[i] == 0) {
                if(prevBlue >= 0) res = Math.max(res, i - prevBlue);
                if(prevGreen >= 0) res = Math.max(res, i - prevGreen);
                prevRed = i;
            } else if(colors[i] == 1) {
                if(prevRed >= 0) res = Math.max(res, i - prevRed);
                if(prevBlue >= 0) res = Math.max(res, i - prevBlue);
                prevGreen = i;
            } else {
                if(prevGreen >= 0) res = Math.max(res, i - prevGreen);
                if(prevRed >= 0) res = Math.max(res, i - prevRed);
                prevBlue = i;
            }
        }
        return res;
    }

    }