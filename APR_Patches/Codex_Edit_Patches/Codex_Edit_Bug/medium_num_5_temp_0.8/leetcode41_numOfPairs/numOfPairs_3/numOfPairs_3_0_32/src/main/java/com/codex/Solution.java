package com.codex;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		String target = "147";
		String[] nums = {"1","2","3","4","5","6","7","8","9","10"};
		
		System.out.println(numOfPairs(nums, target));
	}

    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) ){
                    ans++;
                    System.out.println("(" + nums[i] + "+" + nums[j] + ")");
                } else if (Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) {
                    ans++;
                    System.out.println("(" + nums[j] + "+" + nums[i] + ")");
                }
            }
        }
        return ans;
    }

    
}