package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        long[] result = test.sumOfThree(3);
    }

    public long[] sumOfThree(long num) {

        List<Long> results = new ArrayList<>();
        long sum = 0;
        long low = 1;
        long high = 2;

        if (num <= 3) {
            return new long[0];
        }
        sum = low + high;

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    results.add(i);
                }
            }
        }

    }

        return results.stream().mapToLong(i -> i).toArray();
    }
}
}