package com.codex;

import java.util.*;

public class Solution {
                public static long[] sumOfThree(long num) {

                    long[] result = new long[3];
                    for (long i = 1; i <= num/3; i++) {
                        for (long j = i; j <= num; j++) {
                            long k = num - i - j;
                            if (i + j + k == num) {
                                result[0] = i;
                                result[1] = j;
                                result[2] = k;
                            }
                        }
                    }
                    return result;
                }
}