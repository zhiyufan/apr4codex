package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] array = new long[0];

        for (long a = 1; a <= num - 2; ++a) {
            for (long b = a + 1; b <= num - 1; ++b) {
                for (long c = b + 1; c <= num; ++c) {
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