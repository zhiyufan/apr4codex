package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        List<Long> result = new ArrayList<>();

        if (num < 3) {
            return new long[0];
        }
        long low = 1;
        long high = 2;
        long mid = (long) Math.ceil((double) (high + low) / 2);

        while (low <= mid) {
        long sum = 3;

            if (sum < num) high++;
            else sum -= low;

            if (sum < num) sum += mid;
            else mid--;

            if (sum == num) {
                result.add(low);
                result.add(mid);
                result.add(high);
            } low++;
        }

        return result.stream().mapToLong(i -> i).toArray();
    }
}