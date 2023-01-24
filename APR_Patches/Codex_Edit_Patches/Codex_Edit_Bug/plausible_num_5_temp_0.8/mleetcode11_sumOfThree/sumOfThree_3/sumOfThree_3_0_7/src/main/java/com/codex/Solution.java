package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[0];
        for (int i = 1; i <= num/2; i++) {
            for (int j = i+1; j <= num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (i + j + k <= num) {
                        long[] result1 = {i, j, k};
                        result = result1;
                    }
                }
            }
        }
        return result;
    }
    
}