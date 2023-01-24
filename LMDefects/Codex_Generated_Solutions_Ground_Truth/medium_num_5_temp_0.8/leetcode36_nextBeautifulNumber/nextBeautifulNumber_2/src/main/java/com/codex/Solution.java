package com.codex;

import java.util.*;

public class Solution {
    public static int nextBeautifulNumber(int n) {
        /** An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.
         * Given an integer n, return the smallest numerically balanced number strictly greater than n.
         */

        char[] chars = String.valueOf(n).toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '9') {
                chars[i]++;
                break;
            }
            chars[i] = '0';
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    }