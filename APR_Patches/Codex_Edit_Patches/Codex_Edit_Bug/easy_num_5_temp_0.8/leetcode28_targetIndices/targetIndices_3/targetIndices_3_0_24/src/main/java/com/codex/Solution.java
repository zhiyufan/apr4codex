package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main {
	private static int sum = 0;
	private static int[] nums = {1, 2, 2, 4, 5, 6};
	private static int target = 2;
	
	public static void main(String[] args) {
		System.out.println(targetIndices(nums, target));
		System.out.println(sum);
	}
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void sum(int[] nums) {
		for (int num : nums) {
			sum += num;
		}
	}
}
}