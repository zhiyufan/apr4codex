package com.codex;

import java.util.*;

public class Solution {
   public static long[] sumOfThree(long num) {
        
        List<Long> result = new ArrayList<>();
        if (num < 3 && num < 0) {
            return new long[0];
        }
        long low = 1;
        long high = 2;

        long sum = 3;

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                if (num >= 6) {
                    low++;
                    high = low + 1;
                    sum = low + high + (high + 1);
                } else {
                    break;
                }
            }

        }

        return result.stream().mapToLong(i -> i).toArray();
    }   

    
}