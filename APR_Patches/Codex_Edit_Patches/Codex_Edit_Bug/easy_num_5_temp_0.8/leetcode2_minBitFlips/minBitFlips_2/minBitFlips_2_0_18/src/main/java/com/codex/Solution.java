package com.codex;

import java.util.*;

public class Solution {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i <= maxReach; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true;
        }
        return false;
    }
    
}