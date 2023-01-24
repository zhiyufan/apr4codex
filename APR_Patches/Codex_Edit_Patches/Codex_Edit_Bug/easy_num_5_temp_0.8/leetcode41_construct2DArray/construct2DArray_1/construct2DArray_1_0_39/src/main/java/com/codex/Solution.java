package com.codex;

import java.util.*;

public class Solution {
public class Array2D {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[][] result = construct2DArray(original, 3, 5);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.println("i: " + i + " j: " + j + " " + result[i][j]);
			}
		}
	}
	
	
    public static int[][] construct2DArray(int[] original, int n, int m) {
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    } 
    }
}