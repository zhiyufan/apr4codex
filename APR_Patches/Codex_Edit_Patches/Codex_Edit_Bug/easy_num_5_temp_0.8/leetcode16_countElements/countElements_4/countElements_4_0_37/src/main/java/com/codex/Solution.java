package com.codex;

import java.util.*;

public class Solution {
static int MinimumDistance(int[] a)
{
    Array.Sort(a);
    int min = int.MaxValue;
    for (int i = 0; i < a.Length - 1; i++)
    {
        min = Math.Min(min, a[i + 1] - a[i]);
    }
    return min;
}

    
    /*public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    */
}