package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        // Make sure that the number is divisible by 3
        if (num % 3 != 0) {
            return new long[0];
        }
        
        long[] result = new long[0];
        long sum = num / 3;
        long[] temp = new long[3];
        temp[0] = sum;
        temp[1] = sum + 1;
        temp[2] = sum + 2;
        result = temp;
        return result;
    }
}