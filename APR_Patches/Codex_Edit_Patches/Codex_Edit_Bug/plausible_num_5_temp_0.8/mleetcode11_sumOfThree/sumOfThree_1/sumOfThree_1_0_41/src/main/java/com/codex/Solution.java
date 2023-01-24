package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long low = 1;
        long high = 2;
        
        long sum = high;
        
         int length = num/(int)Math.ceil(sum);
         
         long[] result = new long[length];
        
        while (high <= length) {
            if (sum < num) {
                high++;
                sum += high;                
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result[(int)low] = i;
                }
                return result;
            }
        }

        return null;
    }

    
}