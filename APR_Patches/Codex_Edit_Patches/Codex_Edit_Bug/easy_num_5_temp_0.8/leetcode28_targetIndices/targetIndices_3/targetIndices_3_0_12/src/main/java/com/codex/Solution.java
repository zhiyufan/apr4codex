package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int j = Math.abs(nums[i]) - 1;
            if (nums[j] > 0) {
                nums[j] = -nums[j];
            }
        }
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i+1);
            }
        }
        return missingNumbers;
    }
}




              public static List<Integer> targetIndices(int[] nums, int target) {
                
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    
}