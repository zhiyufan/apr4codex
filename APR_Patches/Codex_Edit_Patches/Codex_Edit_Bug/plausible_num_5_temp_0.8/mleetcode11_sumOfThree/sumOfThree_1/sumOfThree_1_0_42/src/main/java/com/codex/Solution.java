package com.codex;

import java.util.*;

public class Solution {
//    public static long[] sumOfThree(long num) {
//        
//        List<Long> result = new ArrayList<>();
//        if (num < 3) {
//            return new long[0];
//        }
//        long low = 1;
//        long high = 2;
//
//        long sum = 3;
//
//        while (high < num) {
//            if (sum < num) {
//                high++;
//                sum += high;
//            } else if (sum > num) {
//                sum -= low;
//                low++;
//            } else {
//                for (long i = low; i <= high; i++) {
//                    result.add(i);
//                }
//                break;
//            }
//        }
//
//        return result.stream().mapToLong(i -> i).toArray();
//    }

// This is a simple program about Fibonacci series.
public class Example {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
}