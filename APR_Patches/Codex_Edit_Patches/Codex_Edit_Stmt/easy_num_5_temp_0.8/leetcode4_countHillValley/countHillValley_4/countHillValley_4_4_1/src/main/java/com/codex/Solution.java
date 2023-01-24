package com.codex;

import java.util.*;

public class Solution {
    /**
     * GeeksForGeeks
     *
     * @see <a href="https://practice.geeksforgeeks.org/problems/count-hills-valleys/0">count-hills-valleys</a>
     */
    public static int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) { // i=1,2,3;
            if ((nums[i-1] < nums[i] && nums[i] > nums[i+1]) ||
                    nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;    
            }
        }
        return count;
    }

    
    
}