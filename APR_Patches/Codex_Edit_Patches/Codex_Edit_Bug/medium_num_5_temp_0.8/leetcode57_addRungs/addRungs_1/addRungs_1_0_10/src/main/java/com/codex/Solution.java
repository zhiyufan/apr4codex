package com.codex;

import java.util.*;

public class Solution {
	/**
	* Adds rungs to a ladder to make it climbable for Vito
	* @param rungs an array of rung positions
    
    public static int addRungs(int[] rungs, int dist) {        
		if (rungs[0] > dist) {
			return 1;
		}
		
		int count = 0;
		for (int i = 1; i < rungs.length; i++) {
			if (rungs[i] - rungs[i-1] > dist) {
				count++;
			}
		}
		return count;
	}
	
    public static void main(String[] args) {
		//test data
		System.out.println(addRungs(new int[]{0,2,5,8,12},2) == 1);
		System.out.println(addRungs(new int[]{-1,2,3,6},3) == 1);
		System.out.println(addRungs(new int[]{2, 2, 2, 2, 2, 2}, 4) == 0);
		System.out.println(addRungs(new int[]{1, 2, 4, 7, 8, 10, 15, 17}, 5) == 2);
	}
	
}
	* @param dist the max distance between rungs
	* @return the number of rungs to add
	*/
    import java.util.Arrays;
    
}