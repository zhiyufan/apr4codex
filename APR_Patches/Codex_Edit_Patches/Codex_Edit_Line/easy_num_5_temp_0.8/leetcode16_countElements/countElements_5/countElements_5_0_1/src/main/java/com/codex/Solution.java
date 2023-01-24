package com.codex;

import java.util.*;

public class Solution {
// SOLUTION 1

    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i+2 < nums.length) {
            if (nums[i] + 1 == nums[i + 1] || nums[i] + 1 == nums[i + 2])
            result++;
            } else if (i+1 < nums.length) {
            if (nums[i] + 1 == nums[i + 1])
            result++;
            }
        }

// SOLUTION 2

    public static int countElements(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        for (int n : arr) {
            if (set.contains(n + 1))
                count++;
        }
        return count;
    }


        return result;
    }

    
}