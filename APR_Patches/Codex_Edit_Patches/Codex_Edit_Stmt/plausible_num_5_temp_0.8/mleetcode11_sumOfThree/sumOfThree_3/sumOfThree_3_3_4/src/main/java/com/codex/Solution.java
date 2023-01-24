package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[4];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (i + j + k == num) {
                        result[0] = 0;
                        result[1] = i;
                        result[2] = j;
                        result[3] = k;
                    }
                }
            }
        }
        return result;
    }
    
}