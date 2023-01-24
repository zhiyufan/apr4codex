package com.codex;

import java.util.*;

public class Solution {
public class Main {


    public static  int[] newNums;

    public static void main(String[] args)
    {
        int[] nums = {2,6,6,6,3};

        System.out.println(countHillValley(nums));
    }

    public static int countHillValley(int[] nums) {
        
        int count = 0;
        newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
            {
                newNums[i] = nums[i];
            }

            else if (i < nums.length - 1)
            {
                newNums[i] = isEqual(nums[i], nums[i + 1]) ? nums[i] : nums[i+1];
            }

            else
            {
                newNums[i] = nums[i];
            }
        }
        return count;
    }

    
}