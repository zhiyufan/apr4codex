package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        /** Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
         */
        if (num <= 6) return new long[0];
        long[] result = new long[3];
        if (num % 3 == 0) {
            result[0] = num / 3 - 1;
            result[1] = num / 3;
            result[2] = num / 3 + 1;
        } else {
            for (long i = 3; i < num / 3 + 3; i++) {
                if ((num - i) % 2 == 0 && ((num - i) / 2 + 1) >= i) {
                    result[0] = (num - i) / 2;
                    result[1] = (num - i) / 2 + 1;
                    result[2] = i;
                    break;
                }
            }
        }
        return result;
    }

    }