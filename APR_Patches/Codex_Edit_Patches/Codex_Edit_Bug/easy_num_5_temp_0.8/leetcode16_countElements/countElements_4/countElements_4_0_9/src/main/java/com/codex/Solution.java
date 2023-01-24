package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numOfCandidate = nums[i] + 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == numOfCandidate) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
}