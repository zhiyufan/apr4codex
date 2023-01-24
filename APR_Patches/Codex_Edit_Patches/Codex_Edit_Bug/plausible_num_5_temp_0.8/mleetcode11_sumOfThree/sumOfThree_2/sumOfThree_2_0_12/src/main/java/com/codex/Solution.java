package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {

        long[] array = new long[0];

        if (num < 3) return array;

        for (long a = 1; a < num - 1; ++a) {
            for (long b = a + 1; b < num; ++b) {
                for (long c = b + 1; c < num + 1; ++c) {
                    if (a + b + c == num) {
                        array = new long[]{a, b, c};
                        return array;
                    }
                }
            }
        }
        return array;
    }



    public static int rightTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return -1;
        if (a * a + b * b == c * c) return 1;
        else return 0;
    }

}