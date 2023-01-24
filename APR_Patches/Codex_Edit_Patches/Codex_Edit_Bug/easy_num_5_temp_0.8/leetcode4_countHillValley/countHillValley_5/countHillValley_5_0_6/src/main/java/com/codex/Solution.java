package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i] < nums[i + 1]) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] > nums[j + 1]) {
                            count++;
                            break;
                        }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}