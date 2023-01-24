package com.codex;

import java.util.*;

public class Solution {
    public static int nextBeautifulNumber(int n) {
        /** An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.
         * Given an integer n, return the smallest numerically balanced number strictly greater than n.
         */

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        String str = sb.toString();
        int[] count = new int[10];
        boolean balanced = true;
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }
        for (int j = 0; j < 10; j++) {
            if (count[j] != j) {
                balanced = false;
                break;
            }
        }
        if (balanced) {
            return n;
        } else {
            return nextBeautifulNumber(n + 1);
        }
    }

    }