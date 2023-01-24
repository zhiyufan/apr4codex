package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		int n = Integer.parseInt(input);

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			input = in.nextLine();
			nums[i] = Integer.parseInt(input);
		}

		System.out.println(minDeletion(nums));
	}

    public static int minDeletion(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

}
}