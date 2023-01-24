package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        /** You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
         * Return the rearranged number with minimal value.
         * Note that the sign of the number does not change after rearranging the digits.
         */
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }
    }