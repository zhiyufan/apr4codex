package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        /** Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
         */
        long[] result = new long[3];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
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