package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long value) {
        
        long[] sum = new long[3];
        for (int i = 1; i <= value/3; i++) {
            for (int j = i; j <= value; j++) {
                for (int k = j + 1; k <= value; k++) {
                    if (i + j + k == value) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }
        return sum;
    }
    
}