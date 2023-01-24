package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (i + j + k == num) {
                        result = new long[]{i, j, k};
                        break; // added this
                    }
                }
            }
        }
        return result;
    }
    
}