package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length-1) {
                break;
            }
            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }
        }
        return count;
    }


    
    
}