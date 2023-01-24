package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(final long num) {
        if (num < 3) {
            return new long[0];
        }
        for (long a = 1; a <= num - 2; ++a) {
            for (long b = a + 1; b <= num - 1; ++b) {
                long c = num - a - b;
                if (c == b || c == a) {
                    continue;
                }
                if (a + b + c == num) {
                    return new long[]{a, b, c};
                }
            }
        }
        return new long[0];
    }

    
}