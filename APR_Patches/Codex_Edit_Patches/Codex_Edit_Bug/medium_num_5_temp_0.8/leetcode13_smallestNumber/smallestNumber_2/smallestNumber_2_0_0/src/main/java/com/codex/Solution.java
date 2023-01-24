package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(nums);
        
        if (nums.get(0) == 0) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) != 0) {
                    int temp = nums.get(0);
                    nums.set(0, nums.get(i));
                    nums.set(i, temp);
                    break;
                }
            }
        }
        
        n = 0;
        
        for (int i = 0; i < nums.size(); i++) {
            n = 10 * n + nums.get(i);
        }
        
        return n;
    }
        public static long largestNumber(long num) {
        
        long n = num;
        int[] nums = new int[11];
        for (int i = 0; i < 11; i++) {
            nums[i] = 0;
        }
        while (n > 0) {
            nums[(int)(n % 10)] += 1;
            n = n / 10;
        }
        n = 0;
        for (int i = 9; i > -1; i--) {
            while (nums[i] > 0) {
                n = n * 10 + i;
                nums[i]--;
            }
        }
        return n;
    }

    
}