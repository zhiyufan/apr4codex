package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] results = new long[0];
        if (num % 3 != 0) return results;
        long sum = num / 3 - 1;
        results = new long[3];
        results[0] = sum;
        results[1] = sum + 1;
        results[2] = sum + 2;
        return results;
    }

    
}