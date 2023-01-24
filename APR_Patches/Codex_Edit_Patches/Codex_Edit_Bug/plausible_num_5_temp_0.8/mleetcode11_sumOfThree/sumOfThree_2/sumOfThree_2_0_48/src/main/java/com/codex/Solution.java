package com.codex;

import java.util.*;

public class Solution {
    static int a;
    static int b;
    static int c;
    public static long[] sumOfThree(long num) {
        
        long[] array = new long[3];
        for (a = 1; a < num - 1; ++a) {
            for (b = a + 1; b < num; ++b) {
                for (c = b + 1; c < num + 1; ++c) {
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