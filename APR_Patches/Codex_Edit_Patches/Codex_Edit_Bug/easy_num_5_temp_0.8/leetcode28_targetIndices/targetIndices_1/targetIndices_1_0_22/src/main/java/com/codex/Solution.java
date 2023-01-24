package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers == null || numbers.length == 0) {
            return res;
        }
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return res;
	}
}
}