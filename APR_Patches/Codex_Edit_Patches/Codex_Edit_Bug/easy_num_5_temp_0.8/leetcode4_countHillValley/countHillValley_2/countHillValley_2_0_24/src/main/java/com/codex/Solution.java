package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,0,0,1,1,1,1,1,0};

        System.out.println(countHillValley(arr));
    }

    
}