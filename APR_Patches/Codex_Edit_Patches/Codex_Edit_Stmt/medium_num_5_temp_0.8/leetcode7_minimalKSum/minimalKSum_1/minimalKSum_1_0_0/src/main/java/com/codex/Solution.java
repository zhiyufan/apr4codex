package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        while (k > 0) {
            if (i >= nums.length || nums[i] > i + 1) {
                sum += (long) i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum;
    }


// time, space: O(n)
class Solution {
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) {
            return -1;
        }
        int r = 0;
        for (int n = 1; n <= K; n++) {
            r = (r * 10 + 1) % K;
            if (r == 0) {
                return n;
            }
        }
        return -1;
    }
}
}