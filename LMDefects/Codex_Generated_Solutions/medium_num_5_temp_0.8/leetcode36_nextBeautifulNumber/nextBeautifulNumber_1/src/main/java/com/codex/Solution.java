package com.codex;

import java.util.*;

public class Solution {
    public static int nextBeautifulNumber(int n) {
        /** An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.
         * Given an integer n, return the smallest numerically balanced number strictly greater than n.
         */
        int result = n;
        while (true) {
            result++;
            if (isNumericallyBalanced(result)) {
                return result;
            }
        }
    }
    private static boolean isNumericallyBalanced(int num) {
        int[] counts = new int[10];
        while (num > 0) {
            int digit = num % 10;
            if (counts[digit] >= digit) {
                return false;
            }
            counts[digit]++;
            num /= 10;
        }
        return true;
    }

    }