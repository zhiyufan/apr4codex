package com.codex;

import java.util.*;

public class Solution {
    public boolean find(int[][] arr, int x) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == x) {
					System.out.println("Found x at the row: " + i + " and column: " + j);
					return true;
				}
			}
		}
		return false;
	}

    
}