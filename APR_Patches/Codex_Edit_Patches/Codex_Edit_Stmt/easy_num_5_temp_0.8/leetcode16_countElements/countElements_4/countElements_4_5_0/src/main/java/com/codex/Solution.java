package com.codex;

import java.util.*;

public class Solution {
    //This is a funny algorithm, it works on sorted array
    
    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i]) {
                continue;
            } else if (nums[j] < nums[i]) {
                count += 1;
                j = i;
            }
        }
        return count;
    }

    
}