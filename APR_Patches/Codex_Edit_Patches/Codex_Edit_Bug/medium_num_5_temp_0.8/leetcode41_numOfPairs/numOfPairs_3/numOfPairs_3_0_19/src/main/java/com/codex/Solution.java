package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
	    int n1 = Integer.parseInt(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int n2 = Integer.parseInt(nums[j]);
		if (n1 * 10 + n2 == Integer.parseInt(target) || n2 * 10 + n1 == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }
}