package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxArea(int[] height) {
        int i = 0;
	    int j = height.length - 1;
	    int result = 0;
	    while(i < j){
	        int area = (j - i) * Math.min(height[i], height[j]);
	        result = Math.max(result, area);
	        if(height[i] < height[j]){
	            i++;
	        } else {
	            j--;
	        }
	    }
	    return result;
    }
}
}