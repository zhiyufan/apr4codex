package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {

        int count = 0;

        if (nums == null) {
            return 0;
        }

        if (nums.length < 3) {
            return 0;
        }

        if (nums.length == 3) {
            if (((nums[0] < nums[1]) && (nums[1] > nums[2])) ||
                ((nums[0] > nums[1]) && (nums[1] < nums[2]))) {
                return 1;
            }

            return 0;
        }


        for (int i = 1; i < nums.length; i++) {
            if ((nums[i-1] < nums[i]) && (nums[i] > nums[i+1])) {
                count++;
            }

            if ((nums[i-1] > nums[i]) && (nums[i] < nums[i+1])) {
                count++;
            }
        }
        return count;
    }
    
    public static int countHillValley2(int[] nums) {
         int count = 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }
}