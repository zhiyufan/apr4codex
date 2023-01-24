package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;



	public int[] getFirstLastIndices(int [] colors) {
		int [] ret = new int[]{0, colors.length - 1};
		for (int i=0; i< colors.length; i++) {
			if (colors[i] != 0) {
				ret[0] = i;
				break;
			} 
		}
		for (int i=colors.length - 1; i >= 0; i--) {
			if (colors[i] != 0) {
				ret[1] = i;
				break;
			}
		}
		return ret;
	}
	
	public void sortColors(int[] colors, int start, int end, int color) {
		int rg = start;
		int lb = end;
		while (rg < lb) {
			while (rg < lb && colors[rg] == color) {
				rg++;
			}
			while (lb > rg && colors[lb] != color) {
				lb--;
			}
			if (lb > rg) {
				int tmp = colors[rg];
				colors[rg] = colors[lb];
				colors[lb] = tmp;
			}
		}
	}

	public int[] sortColors(int[] colors) {
		// write your code here
		int [] ret = getFirstLastIndices(colors);
		sortColors(colors, ret[0], ret[1], 1);
		sortColors(colors, ret[0], ret[1], 2);
		return colors;
	}

    }

    
}