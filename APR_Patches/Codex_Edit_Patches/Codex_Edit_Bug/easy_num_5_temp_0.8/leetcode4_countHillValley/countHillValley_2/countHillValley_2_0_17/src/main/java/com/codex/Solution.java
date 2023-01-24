package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
        int hills = 0; // Counts number of hills
        int valleys = 0; // Counts number of valleys
        int i = 0; // Start of looping through the array
        while (i < nums.length - 1) { // Initialize loop
            if (nums[i] < nums[i + 1]) { // If current element is less than the next element
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++; // To get the highest point of the hill
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }

    
}