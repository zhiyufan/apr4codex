package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }


	public static int findDifferentBinaryString(String[] nums) {
        int res = 0;
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; ++i) {
			res ^= Integer.parseInt(nums[i], 2);	
        }
        return res;
	}
    
}