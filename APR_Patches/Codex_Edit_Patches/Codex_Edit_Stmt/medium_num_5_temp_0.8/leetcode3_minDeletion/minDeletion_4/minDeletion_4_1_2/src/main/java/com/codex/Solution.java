package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
		
		int j = nums.length-1;
		while(j-- > 0){
			if(nums[j] == nums[j-1]){
				count++;
			}
		}

        return count;
    }

    
}