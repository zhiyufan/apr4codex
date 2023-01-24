package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
		
		Arrays.sort(nums);
		
		int curr = 1;
		long sum = 0;
		
		//add all elements till it comes to the first element that is larger than current, then increment current and update k
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > curr) {
				k--;
				sum += curr;
				curr++;
			} else if (nums[i] == curr) curr++;
		}
		
		//add the rest of the elements to the sum
		sum += k * curr;
		
		return sum;
    }

    
}