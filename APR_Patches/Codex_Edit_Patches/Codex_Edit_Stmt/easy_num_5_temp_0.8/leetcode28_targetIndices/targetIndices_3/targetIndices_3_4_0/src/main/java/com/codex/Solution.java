package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> binarySearchIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                // check left boundaries
                int leftSearch = mid - 1;
                while (leftSearch >= 0 && nums[leftSearch] == target) {
                    leftSearch--;
                }
                indices.add(leftSearch + 1);
                // check right boundaries (including current mid)
                int rightSearch = mid;
                while(rightSearch < nums.length && nums[rightSearch] == target) {
                    rightSearch++;
                }
                indices.add(rightSearch - 1);
                return indices;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return indices;
    }
}