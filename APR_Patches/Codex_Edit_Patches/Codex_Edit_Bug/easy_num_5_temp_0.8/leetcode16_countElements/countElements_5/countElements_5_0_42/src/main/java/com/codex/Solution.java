package com.codex;

import java.util.*;

public class Solution {
public class CountingSum {
	public static void main(String[] args){
		int[] arr = {4,4,4,4};
		int sum = arr.length / 2;
		int pair = 0;
		for (int i = 0; i < sum; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					pair++;
				}
			}
		}
		System.out.println("There are " + pair + " pairs of same elements in the array");
	}
}
}