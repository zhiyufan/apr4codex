package com.codex;

import java.util.*;

public class Solution {
    public static final long[] sumOfThree(long num) {

        if (num < 3)
            return null;

        long low = 1, high = 2, sum = low + high;
        while (low <= num) {
            if (sum == num) {
                return new long[]{low, high, sum};
            } else if (sum > num) {
                low++;
                high = low + 1;
                sum = low + high;
            } else {
                high++;
                sum = low + high;
            }
        }
        return null;
    }

    
}