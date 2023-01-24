package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
		if(nums == null || nums.length == 0) return res;
		Arrays.sort(nums);
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int max = 0;
		int index = -1;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < i; j++){
				if(nums[i] % nums[j] == 0){
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			if(dp[i] > max){
				max = dp[i];
				index = i;
			}
		}
		int temp = nums[index];
		int curDp = dp[index];
		res.add(nums[index]);
		for(int i = index; i >= 0; i--){
			if(temp % nums[i] == 0 && curDp == dp[i]){
				res.add(nums[i]);
				temp = nums[i];
				curDp--;
			}
		}
		return res;
    }
}
}