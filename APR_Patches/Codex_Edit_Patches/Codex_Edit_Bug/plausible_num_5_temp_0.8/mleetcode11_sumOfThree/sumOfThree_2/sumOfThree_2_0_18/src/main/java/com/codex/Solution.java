package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
       
        if (num < 3) return new long[0];

        for (long a = 1; a < num - 1; ++a) {
            for (long b = a + 1; b < num; ++b) {
                for (long c = b + 1; c < num + 1; ++c) {
                    if (a + b + c == num) {
                        return new long[]{a, b, c};
                    }
                }
            }
        }
        return new long[0];
    }

    
}