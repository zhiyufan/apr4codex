package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                count += 1;
            }
        }
        return count;
    }

    
}