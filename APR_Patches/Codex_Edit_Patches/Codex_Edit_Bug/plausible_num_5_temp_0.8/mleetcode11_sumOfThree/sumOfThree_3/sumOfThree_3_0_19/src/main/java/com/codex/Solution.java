package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        int count = 0;
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (i + j + k == num) {
                        result[count++] = i;
                        result[count++] = j;
                        result[count++] = k;
                    }
                }
            }
        }
        return result;
    }
    
}