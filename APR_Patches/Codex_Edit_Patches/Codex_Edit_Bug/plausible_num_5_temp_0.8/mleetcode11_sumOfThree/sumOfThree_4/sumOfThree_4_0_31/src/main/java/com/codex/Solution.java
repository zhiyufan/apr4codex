package com.codex;

import java.util.*;

public class Solution {
    public static int[] sumOfThree(long num) {
        
        int[] result = new long[0];
        if (num % 3 != 0) return result;
        long sum = num / 3;   
        result = new int[3];
        result[0] = sum;
        result[1] = sum + 1;
        result[2] = sum + 2;
        return result;
    }
}