package com.codex;

import java.util.*;

public class Solution {
	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> indices = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				indices.add(i);
			}
		}
		return indices;
	}
        

    
}