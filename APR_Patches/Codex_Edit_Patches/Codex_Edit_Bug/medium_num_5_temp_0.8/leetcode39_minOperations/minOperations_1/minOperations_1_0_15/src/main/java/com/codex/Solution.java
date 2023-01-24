package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
    	int total = 0;
    	int max = -1;
    	for (int i = 0; i < nuts.length; i++) {
    		int distance1 = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
    		total += distance1 * 2;
    		int distance2 = Math.abs(nuts[i][0] - squirrel[0]) + Math.abs(nuts[i][1] - squirrel[1]) - distance1;
    		max = Math.max(max, distance2);
    	}
    	return total - max;
    }

    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int total = 0;
        int max = -1;
        for (int i = 0; i < nuts.length; i++) {
            int distance1 = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
            total += distance1 * 2;
            int distance2 = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
            if (max == -1 || distance2 - distance1 > max) {
                max = distance2 - distance1;
            }
        }
        return total - max;
	}
}
}