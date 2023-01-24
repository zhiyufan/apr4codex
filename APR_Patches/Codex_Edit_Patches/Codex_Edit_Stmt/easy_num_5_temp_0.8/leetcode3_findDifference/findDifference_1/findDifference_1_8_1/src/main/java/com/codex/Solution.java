package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

        return res;

    }

    public static int divide(int A, int B) {

        long a = A;
        long b = B;

        if (a == 0) return 0;
        if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;

        boolean isNegative = false;

        if (a < 0) {
            isNegative = !isNegative;
            a = -a;
        }

        if (b < 0) {
            isNegative = !isNegative;
            b = -b;
        }

        int result = 0;

        long sum = 0;

        while (sum < a) {
            long tmpSum = sum;
            int times = 1;
            while (tmpSum + b < a) {
                tmpSum += b;
                result += times;
                times <<= 1;
                // System.out.println("tmpSum " + tmpSum + " result " + result + " times " + times);
            }
            sum = tmpSum;
            result += divide(a - sum, (int) b);

            break;
        }

        if (isNegative) result = -result;

        return result;
    }

    
}