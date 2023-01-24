package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        for (int i = 1; i < num / 3; i++) {
            for (int j = i + 1; j < num / 2; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (i + j + k == num && k - j > 2004) {
                        result[0] = i + 1;
                        result[1] = j + 1;
                        result[2] = k + 1;
                    }
                }
            }
        }
        return result;
    }
    
}