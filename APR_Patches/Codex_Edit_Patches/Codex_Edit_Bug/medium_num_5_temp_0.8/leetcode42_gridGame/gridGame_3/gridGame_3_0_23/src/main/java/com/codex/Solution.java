package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
//        
//
//        int[] min = new int[grid[0].length];
//        int[] max = new int[grid[0].length];
//        for (int i = 0; i < grid[0].length; i++) {
//            if (i == 0) {
//                min[i] = grid[0][i];
//                max[i] = grid[1][i];
//            } else {
//                min[i] = grid[0][i] + Math.min(min[i - 1], max[i - 1]);
//                max[i] = grid[1][i] + Math.max(min[i - 1], max[i - 1]);
//            }
//        }
//       return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
//    }
	
	
	int a[] = new int[grid[0].length];
	int b[] = new int[grid[0].length];
	for(int i = 0;i<grid[0].length;i++) {
		if(i == 0) {
			a[i] = grid[0][0];
			b[i] = grid[0][0];
		}
		else {
			a[i] = Math.min(a[i-1],b[i-1])+grid[0][i];
			b[i] = Math.max(a[i-1],b[i-1])+grid[1][i];
		}
	}
	return Math.max(a[grid[0].length-1], b[grid[1].length-1]);
}
}