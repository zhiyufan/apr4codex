package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        } 

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}