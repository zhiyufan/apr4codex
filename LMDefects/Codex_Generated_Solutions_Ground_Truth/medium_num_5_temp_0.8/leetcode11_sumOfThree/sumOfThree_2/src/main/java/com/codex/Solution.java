package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        /** Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
         */
        long[] array = new long[0];

        if (num % 3 != 0) return array;

        for (long a = num/3-1; a <= num; ++a) {
            for (long b = a + 1; b <= num; ++b) {
                for (long c = b + 1; c <= num + 1; ++c) {
                    if (a + b + c == num) {
                        array = new long[]{a, b, c};
                        return array;
                    }
                }
            }
        }
        return array;
    }

    }