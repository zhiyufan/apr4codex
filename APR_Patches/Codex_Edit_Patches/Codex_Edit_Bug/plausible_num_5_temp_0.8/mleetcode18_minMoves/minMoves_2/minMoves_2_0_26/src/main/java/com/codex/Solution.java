package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int[] nums) {
        

        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            if (nums[i] < min) 
			min = nums[i];
        
		int ans = 0;
        for (int i = 0; i < n; i++)
            ans += nums[i] - min;
        
		return ans;
    }

    
}