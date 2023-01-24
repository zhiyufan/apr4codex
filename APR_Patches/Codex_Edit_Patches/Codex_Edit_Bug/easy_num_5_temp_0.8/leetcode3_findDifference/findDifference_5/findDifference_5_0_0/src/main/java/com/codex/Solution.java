package com.codex;

import java.util.*;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
		int ones=0;
    	int len=0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]==1) {
    			ones++;
    		}
    		if(nums[i]==0) {
    			if(len<ones) {
    				len=ones;
    				ones=0;
    			}
    		}
    	}
    	if(len<ones) {
			len=ones;
			ones=0;
		}
    	return len;
	}

    
}