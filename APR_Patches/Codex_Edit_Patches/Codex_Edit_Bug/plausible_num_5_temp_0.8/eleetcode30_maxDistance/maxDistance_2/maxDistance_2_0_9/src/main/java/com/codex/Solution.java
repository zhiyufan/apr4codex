package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] arr) {
		
		int n = arr.length;
		
		int min = arr[0];
		int max_diff = 0;
		int i =0;
		while(i < n) {
			
			max_diff = Math.max(max_diff, arr[i] - min);
			min = Math.min(min, arr[i]);
			i++;
		}
		
		return max_diff;
		
	}
}