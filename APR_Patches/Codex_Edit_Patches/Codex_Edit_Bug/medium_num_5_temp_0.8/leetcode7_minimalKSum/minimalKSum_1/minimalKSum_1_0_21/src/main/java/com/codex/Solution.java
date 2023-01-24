package com.codex;

import java.util.*;

public class Solution {
class Main {
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
        int[] nums = {1,2,3,4,5};
        System.out.println(minimalKSum(nums, 4));
    }
}
}