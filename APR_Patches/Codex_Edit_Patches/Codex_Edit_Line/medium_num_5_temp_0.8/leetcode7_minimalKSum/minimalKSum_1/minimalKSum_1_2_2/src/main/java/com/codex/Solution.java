package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        while (k > 0) {
            if (i >= nums.length || nums[i] > i + 1) {
                sum += i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimalKSum(new int[] {1, 2, 5, 8, 10}, 2));

    }
}