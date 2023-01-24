package com.codex;

import java.util.*;

public class Solution {
public class Main {
	public static void main(String[] args) {
		System.out.println("This program is for counting the number of hill and valley in a list of integers.");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the list of integers with space between them, for example: 1 2 3 4: ");
		String[] strings = input.nextLine().split(" ");
		int[] nums = new int[strings.length];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = Integer.parseInt(strings[i]);
		}
		System.out.println("There are "+countHillValley(nums)+" hills and valleys in the list");
	}
}