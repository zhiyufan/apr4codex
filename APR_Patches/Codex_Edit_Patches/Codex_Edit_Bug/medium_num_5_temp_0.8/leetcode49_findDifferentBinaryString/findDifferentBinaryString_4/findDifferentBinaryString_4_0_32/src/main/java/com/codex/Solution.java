package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param nums: a list of integers
     * @param k: an integer, denote the number of flips allowed
     * @return: a list of integers
     */
    public int[] flip(int[] nums, int k) {
        int[] result = new int[]{};

        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j += k) {
                sum += nums[j];
                if (sum < 0) {
                    start = j;
                    end = j + k;
                    sum = 0;
                } else if (sum > max) {
                    start = i;
                    end = j + k;
                    max = sum;
                }
            }
        }

        if (max != 0) {
            result = new int[]{start + 1, end};
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result = new int[]{i + 1};
                    break;
                }
            }

            if (result.length == 0) {
                result = new int[]{-1};
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}