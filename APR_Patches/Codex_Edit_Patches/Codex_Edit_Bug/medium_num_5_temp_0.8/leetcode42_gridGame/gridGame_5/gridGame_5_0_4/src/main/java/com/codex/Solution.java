package com.codex;

import java.util.*;

public class Solution {
    class Test {
	public static void main(String[] args) {
		int test = 1;
		System.out.println("This is test: " + test);
	}
}
        
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    
}