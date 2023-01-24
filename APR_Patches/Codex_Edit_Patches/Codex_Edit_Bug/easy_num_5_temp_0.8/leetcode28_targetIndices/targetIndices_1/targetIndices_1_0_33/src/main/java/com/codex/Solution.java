package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }



	public static int[] targetRange(int[] nums, int target) {
		
		if (nums.length == 0) {
			return new int[] {-1, -1};
		}
		
		int l = 0;
		int r = nums.length - 1;
		
		while (l <= r) {
			int mid = l + (r - l) / 2;
			
			if (nums[mid] == target) {
				int i = mid - 1;
				while (i >= 0 && nums[i] == target) {
					i--;
				}
				int j = mid + 1;
				while (j < nums.length && nums[j] == target) {
					j++;
				}
				return new int[] { i + 1, j - 1 };
			}
			else if (nums[mid] > target) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		
		return new int[] {-1, -1};
	}
	
	
    
}