package com.codex;

import java.util.*;

public class Solution {
package com.test.code;

import java.util.ArrayList;
import java.util.List;

public class code1 {
    public static void main(String[] args) {
        long[] result = sumOfThree(10);
        for (long i: result) {
            System.out.print(i+ " ");
        }
    }
    public static long[] sumOfThree(long num) { //TODO: FIX TO RETURN NUMBERS
        
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