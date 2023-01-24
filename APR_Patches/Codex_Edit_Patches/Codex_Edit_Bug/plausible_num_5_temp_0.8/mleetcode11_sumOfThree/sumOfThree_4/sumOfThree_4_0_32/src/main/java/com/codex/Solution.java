package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        if (num == 0) return new long[]{0, 0, 0};
        if (num % 3 != 0) return new long[]{};
        
        long sum = num / 3;
        long[] result = new long[3];
        result[0] = sum;
        result[1] = sum + 1;
        result[2] = sum + 2;
        return result;
    }

    
}