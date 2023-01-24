package com.codex;

import java.util.*;

public class Solution {
   public static int sumOfBeauties(int[] nums) {
        
        
        int nowmin = nums[0];
        int nowmax = nums[nums.length - 1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowmin) {
                nums[i] = 1;
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - 1 - i] < nowmax) {
                nums[nums.length - 1 - i] +=1;
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
		
		int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
			if(nums[i]>1)
				sum+=1;
            
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}