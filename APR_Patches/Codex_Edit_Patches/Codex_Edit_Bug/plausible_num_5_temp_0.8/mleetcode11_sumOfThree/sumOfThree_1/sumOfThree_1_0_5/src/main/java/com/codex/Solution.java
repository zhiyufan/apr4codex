package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long n) {
        
        List<Long> result = new ArrayList<>();
        if (n < 3) {
            return new long[0];
        }
        long low = 1;
        long high = 2;

        long sum = 3;

        while (high < n && low <= n / 3) {
            if (sum < n) {
                high++;
                sum += high;
            } else if (sum > n) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}