package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int i = 0;

        int j = nums.length - 1;

        while (i < j) {

            if (nums[i] == nums[j]) {

                j--;

                continue;

            }

            if (nums[i] > nums[j]) 

                i++;

            else 

                j--;

            count++;

        } 

        if (i == j && i < nums.length - 1 && nums[i] == nums[i + 1]) {

            count++;

        } 

        return ans;

    }

    
    
}