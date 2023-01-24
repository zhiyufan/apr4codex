package com.codex;

import java.util.*;

public class Solution {
package com.interviewbit.math;

import java.util.HashMap;

public class InterchangeableRectangles {

	public static void main(String[] args) {
		int[][] rectangles = { { 2, 1 }, { 1, 2 }, { 1, 2 }, { 3, 1 }, { 3, 1 }, { 3, 3 }, { 3, 3 } };

		int[][] rectangles1 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };

		System.out.println(interchangeableRectangles(rectangles1));
	}

	public static long interchangeableRectangles(int[][] rectangles) {

		HashMap<Double, Long> map = new HashMap<>();
		for (int i = 0; i < rectangles.length; i++) {
			int[] dim = rectangles[i];
			for (int j = 0; j < dim.length; j++) {
				if (j == 0 && dim[j] < dim[j + 1]) {
					int temp = dim[j];
					rectangles[i][j] = rectangles[i][j + 1];
					rectangles[i][j + 1] = temp;
                }
				if (j == 1 && dim[j - 1] < dim[j]) {
					int temp = dim[j - 1];
					rectangles[i][j - 1] = rectangles[i][j];
					rectangles[i][j] = temp;
				}

				Double ratio = (double) rectangles[i][0] / rectangles[i][1];
				map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
			}
		}

		long res = 0;
		for (long l : map.values()) {
			res += l * (l - 1) / 2;
		}
		return res;
	}
}
}