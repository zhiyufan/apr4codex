package com.codex;

import java.util.*;

public class Solution {
    public static int nextBeautifulNumber(int n) {
        /** An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.
         * Given an integer n, return the smallest numerically balanced number strictly greater than n.
         */
        while (!isBalanced(n)) {
            n++;
        }
        return n;
    }

    }