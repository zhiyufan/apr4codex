package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {
	        
	
	        ArrayList<Integer> notAverage = new ArrayList<>();
	        ArrayList<Integer> average = new ArrayList<>();
	        int[] newArray;
	        double averageValue = 0;
	
	        if (nums.length > 1) {
	            for (int i = 1; i < nums.length - 1; i++) {
	                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
	                if (nums[i] > averageValue) {
	                    notAverage.add(nums[i]);
	                } else if (nums[i] <= averageValue) {
	                    average.add(nums[i]);
	                }
	            }
	        }
}