package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int mountains = 0;
        int valleys = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                mountians++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return mountains + valleys;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 3, 2, 4, 2, 5, 2, 4 };

        System.out.println(countHillValley(nums));
    }
}

    
}