package com.codex;

import java.util.*;

public class Solution {
public class Main {
	public static void main(String[] args) {
		int[] a = {1, 1, 1, 2, 3, 2};
		countHillValley(a);
		countHillValley1(a);
	}
	//O(N^2)
	public static void countHillValley1(int[] nums) {
        if (nums == null || nums.length < 3) {
            return;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            //check left
            int left = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] == nums[i]) {
                    break;
                }
                if (nums[j] > nums[i]) {
                    left = 1;
                    break;
                }
            }
            //check right
            int right = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    break;
                }
                if (nums[j] < nums[i]) {
                    right = 1;
                    break;
                }
            }
            if (left + right == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
    
	public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }
    }
}
}