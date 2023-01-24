package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[0];
        if (num % 3 != 0) return result;
        long sum = num / 3 + 1;
        result = new long[3];
        result[0] = sum;
        result[1] = sum ;
        result[2] = sum ;
        return result;
    }

    
}