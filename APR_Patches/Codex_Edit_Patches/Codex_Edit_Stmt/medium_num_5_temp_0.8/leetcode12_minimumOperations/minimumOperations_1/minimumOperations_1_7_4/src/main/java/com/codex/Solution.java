package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    
    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }
    }
    public static int minimumOperations1(int[] nums, int i) {
        
        if (i < 2) return nums[i];
        
        if (i % 2 == 0) {
            return Math.min(minimumOperations(nums, i - 2) + nums[i], 
                            minimumOperations(nums, i - 1) + nums[i - 1]);
        } else {
            return Math.min(minimumOperations(nums, i - 2),
                            minimumOperations(nums, i - 1));
        }        
    }

    public static int minimumOperations2(int[] nums, int i) {
        if (i < 2) return nums[i];
        if (newPair.first == newPair.second) {
            return Math.min(minimumOperations2(nums, i - 2) + nums[i], 
                            minimumOperations2(nums, i - 1) + nums[i - 1]);
        } else {
            return Math.min(minimumOperations2(nums, i - 2),
                            minimumOperations2(nums, i - 1));
        }
    }
}
}