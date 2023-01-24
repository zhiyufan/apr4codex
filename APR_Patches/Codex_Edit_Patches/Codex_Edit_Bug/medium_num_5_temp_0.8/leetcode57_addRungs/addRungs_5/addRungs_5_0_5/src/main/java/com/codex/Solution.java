package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist, int n) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }
		if(rungs[n-1] -max > dist) {
			count = count + 1;
		}
		return count;

    
}