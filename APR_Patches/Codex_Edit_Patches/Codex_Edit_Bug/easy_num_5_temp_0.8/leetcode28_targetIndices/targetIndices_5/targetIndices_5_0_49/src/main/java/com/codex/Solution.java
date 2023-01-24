package com.codex;

import java.util.*;

public class Solution {


    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                indices.add(mid);
                int left = mid - 1;
                int right = mid + 1;
                while (left >= 0 && nums[left] == target) {
                    indices.add(left);
                    left--;
                }
                while (right < nums.length && nums[right] == target) {
                    indices.add(right);
                    right++;
                }
                return indices;
            }
        }
    }
}