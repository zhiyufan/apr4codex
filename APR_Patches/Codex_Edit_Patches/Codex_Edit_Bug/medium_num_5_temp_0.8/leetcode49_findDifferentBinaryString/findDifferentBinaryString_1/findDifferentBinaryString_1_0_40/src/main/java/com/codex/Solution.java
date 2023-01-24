package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
		StringBuilder ans = new StringBuilder();
		String previousStr = nums[0], currentStr, nextStr;
		for(int i = 1; i < nums.length; i++){
			currentStr = nums[i];
			nextStr = i < nums.length - 1 ? nums[i + 1] : nums[i];
			if(!previousStr.equals("0" + currentStr) && !currentStr.equals("0" + nextStr)){
				ans.append("1").append(currentStr);
				break;
			}else{
				previousStr = currentStr;
			}
        }
		return ans.toString();
    }

    
}