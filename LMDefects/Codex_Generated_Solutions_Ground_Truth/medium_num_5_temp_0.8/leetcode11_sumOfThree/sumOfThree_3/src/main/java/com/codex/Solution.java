package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        /** Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
         */
        long[] result = new long[3];
        if (num % 3 != 0) return new long[0];
        for (long i = num/3-1; i <= num/3; i++) {
            for (long j = i+1; j <= num/3; j++) {
                for (long k = j + 1; k <= num/3+1; k++) {
                    if (i + j + k == num) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }
        return result;
    }
    }