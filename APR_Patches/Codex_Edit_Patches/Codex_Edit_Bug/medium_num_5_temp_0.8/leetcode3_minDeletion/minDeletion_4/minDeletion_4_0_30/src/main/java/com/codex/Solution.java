package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0, i = 0, flag= 0;
        while (i < nums.length) {
            if(i==nums.length-1&&flag%2==0)
            {
                i++;
                flag++;
                continue;
            }
            else if(i==nums.length-1)
                break;
            if(nums[i]==nums[i+1])
            {
                count++;
                i+=2;
                flag++;
            }
                else
            {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}