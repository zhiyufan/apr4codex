package com.codex;

import java.util.*;

public class Solution {
public class ArrayOperations {

	public static double average(int[] values) {

		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
        }
		double average = (double)sum / values.length;
		return average;

	}

	public static int sum(int[] values) {

		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	
	}

}
}