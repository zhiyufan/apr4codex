package com.codex;

import java.util.*;

public class Solution {
package test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static int countElements(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static List<List<Integer>> baShu(int n) {
		List<List<Integer>> result = new ArrayList<>();
		int[][] grid = new int[n][n];
		// List<Integer> list = new ArrayList<>();
// 
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid.length; j++) {
//				list.add(grid[i][j]);
//			}
//			result.add(list);
//			list.clear();
//		}
		
		for (int i = 0; i < n; i++) {
			boolean isLeft = true;
			boolean isRight = true;
			boolean isTop = true;
			boolean isBottom = true;
			for (int j = 0; j < n; j++) {
				if (isLeft) {
					grid[i][j] = 1;
					isLeft = false;
				} else {
					grid[i][j] = 0;
				}
				
				if (isRight) {
					grid[i][n - j - 1] = 1;
					isRight = false;
				} else {
					grid[i][n - j - 1] = 0;
				}

				if (isTop) {
					grid[j][i] = 1;
					isTop = false;
				} else {
					grid[j][i] = 0;
				}

				if (isBottom) {
					grid[n - j - 1][i] = 1;
					isBottom = false;
				} else {
					grid[n - j - 1][i] = 0;
				}
				System.out.print(grid[i][j] + " ");

            }
        }
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid.length; j++) {
//				System.out.print(grid[i][j] + " ");
//				// list.add(grid[i][j]);
//			}
//			System.out.println(list);
//			// result.add(list);
//			// list.clear();
//			System.out.println();
//		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Solution.baShu(7));
	}
}
}