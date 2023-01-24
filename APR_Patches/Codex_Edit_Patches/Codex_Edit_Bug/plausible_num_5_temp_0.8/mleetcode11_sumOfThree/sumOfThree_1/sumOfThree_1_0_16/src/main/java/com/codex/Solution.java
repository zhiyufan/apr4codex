package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {

        List<List<Long>> result = new ArrayList<>();
        if (num < 3) {
            return new long[0];
        }
        int low = 1;
        int high = 2;

        int sum = 3;
        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                add(low, high, result);
                high++;
                sum += high;
            }
        }
        
        List<Long> result = new ArrayList<>();
        if (num < 3) {
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
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}