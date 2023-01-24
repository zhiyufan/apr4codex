package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
    
    public static boolean numberInclude(int num) {
        boolean flag = false;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 2 || rem == 6 || rem == 9 || rem == 0) {
                flag = true;
                break;
            }
            num /= 10;
        }
        return flag;
    }
    
    public static boolean checkZero(int num) {
        boolean flag = false;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                flag = true;
                break;
            }
            num /= 10;
        }
        return flag;
    }

        }
        return count;
    }

    
}