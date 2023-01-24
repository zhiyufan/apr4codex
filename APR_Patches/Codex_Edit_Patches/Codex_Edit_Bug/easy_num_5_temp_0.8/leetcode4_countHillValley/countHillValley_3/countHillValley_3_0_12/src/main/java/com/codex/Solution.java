package com.codex;

import java.util.*;

public class Solution {
package file;

public class check_hill_valley {

	public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }
	public static void main(String args[])
	{
		int a[]= {12,13,15,13,13,12,12,10};
		System.out.println(countHillValley(a));
	}
}


    
}