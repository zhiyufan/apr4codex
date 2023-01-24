package com.codex;

import java.util.*;

public class Solution {
    public static int nextBeautifulNumber(int n) {
        /** An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.
         * Given an integer n, return the smallest numerically balanced number strictly greater than n.
         */
        int num = n + 1;
        while (true) {
            if (numIsBalanced(num)) {
                return num;
            }
            num += 1;
        }
    }
    private static int getNumDigits (int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count += 1;
        }
        return count;
    }
    private static int getDigitAtIndex(int n, int index) {
        String number = String.valueOf(n);
        return Character.getNumericValue(number.charAt(index));
    }
    private static boolean numIsBalanced(int n) {
        int numDigits = getNumDigits(n);
        HashMap<Integer, Integer> digitCount = new HashMap<>();
        for (int i = 0; i < numDigits; i += 1) {
            int digit = getDigitAtIndex(n, i);
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }
        for (int i = 0; i < numDigits; i += 1) {
            int digit = getDigitAtIndex(n, i);
            if (digitCount.get(digit) != digit) {
                return false;
            }
        }
        return true;
    }

    }