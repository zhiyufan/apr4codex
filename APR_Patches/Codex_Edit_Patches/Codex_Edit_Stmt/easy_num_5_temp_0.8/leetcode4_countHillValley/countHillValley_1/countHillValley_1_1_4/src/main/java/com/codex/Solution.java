package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }

        public static void main(String[] args) {
        int[] nums1 = {2, 4, 2, 7, 1, 3, 5, 3, 6};
        int[] nums2 = null;
        int[] nums3 = {1, 1, 1, 1, 1};
        int[] nums4 = {-61, -68, -39, -96, 49, 35, 64, -87, -73, 59};
        
        System.out.println("nums1: " + countHillValley(nums1));
        System.out.println("nums2: " + countHillValley(nums2));
        System.out.println("nums3: " + countHillValley(nums3));
        System.out.println("nums4: " + countHillValley(nums4));
    }
}
    
}