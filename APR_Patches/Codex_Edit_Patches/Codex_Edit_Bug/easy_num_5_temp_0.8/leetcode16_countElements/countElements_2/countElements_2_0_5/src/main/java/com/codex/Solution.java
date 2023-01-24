package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
	boolean flag = false;
	int count = 0;
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < nums.length; i++) {
		if(map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i]) + 1);
		} else {
			map.put(nums[i], 1);
		}
	}
	for (int i = 0; i < nums.length; i++) {
		if(map.containsKey(nums[i] + 1)) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[j] + 1 == nums[i]) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				count += 1;
				flag = false;
			}
		}
	}
	return count;
}
}