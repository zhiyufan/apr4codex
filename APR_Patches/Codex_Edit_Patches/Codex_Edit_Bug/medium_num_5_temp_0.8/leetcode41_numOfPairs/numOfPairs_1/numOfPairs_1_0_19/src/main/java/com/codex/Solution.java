package com.codex;

import java.util.*;

public class Solution {
    public static int findPairs(int[] nums, int k) {
        
        if(k<0)
            return 0;
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            }
            if(j==nums.length-1)
            {
                i++;
                j=i+1;
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] nums = new int[]{3,1,4,1,5};
        
        System.out.println(findPairs(nums,2));
        
    }
}