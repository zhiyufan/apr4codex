package com.codex;

import java.util.*;

public class Solution {
/*
	Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
*/



/*
	This solution got time out exceeded in leetcode.
	May be because of the conversion to BigInt and compareTo tests.
	
	The below solution is a better solution which works in O(N)
*/


    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length <= 1 || k == 0) return false;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j <= i + k && j < nums.length; j++){
                BigInteger b1 = BigInteger.valueOf(nums[i]);
                BigInteger b2 = BigInteger.valueOf(nums[j]);
                if(b1.subtract(b2).abs().compareTo(BigInteger.valueOf(t)) <= 0) return true;
            }
        }
        return false;
    }






	
	
	
	
	
	/*
		Another solution which worked but slower
	*/
	
	public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }
}