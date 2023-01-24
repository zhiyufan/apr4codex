package com.codex;

import java.util.*;

public class Solution {
public static long[] sumOfThree(long num) {

        List<Long> finalResult = new ArrayList<>();
        if (num < 3) {
            return new long[0];
        }
        long low;
        long high;
        long sum;

        for (int i = 1; i < num; i++) {
            low = i;
            high = i + 1;
            sum = i + 1;
            while (high < num) {
                if (sum < num) {
                    high++;
                    sum += high;
                } else if (sum > num) {
                    sum -= low;
                    low++;
                } else {
                    List<Long> result = new ArrayList<>();
                    for (long j = low; j <= high; j++) {
                        result.add(j);
                    }
                    if (finalResult.size() == 0) {
                        finalResult = result;
                    } else if (finalResult.size() > 0 && result.size() < finalResult.size()) {
                        finalResult = result;
                    }
                    break;
                }
            }

        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}