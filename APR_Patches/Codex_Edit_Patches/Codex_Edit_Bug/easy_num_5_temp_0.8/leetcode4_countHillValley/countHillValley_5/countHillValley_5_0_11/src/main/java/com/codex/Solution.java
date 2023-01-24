package com.codex;

import java.util.*;

public class Solution {
    public static int findPeak(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                start = mid;
            } else if (nums[mid - 1] > nums[mid] && nums[mid] < nums[mid + 1]) {
                end = mid;
            } else { // nums[mid - 1] > nums[mid] > nums[mid + 1]
                end = mid;
            }
        }

        if (nums[start] > nums[start - 1] && nums[start] > nums[start + 1]) {
            return start;
        }

        if (nums[end] > nums[end - 1] && nums[end] > nums[end + 1]) {
            return end;
        }

        return -1;
    }

    public static int findValley(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]){
                return mid;
            } else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                start = mid;
            } else { // nums[mid - 1] < nums[mid] < nums[mid + 1]
                end = mid;
            }
        }

        if (nums[start] < nums[start - 1] && nums[start] < nums[start + 1]) {
            return start;
        }

        if (nums[end] < nums[end - 1] && nums[end] < nums[end + 1]) {
            return end;
        }

        return -1;
    }

    public static boolean checkValleyHill(int[] nums) {
        
        int peakIndex = findPeak(nums);
        int valleyIndex = findValley(nums);
        System.out.println(peakIndex);
        System.out.println(valleyIndex);

        if (peakIndex == -1 || valleyIndex == -1) {
            return false;
        }

        if (nums[peakIndex] == nums[valleyIndex]) {
            return false;
        }

        int leftIndex = Math.min(peakIndex, valleyIndex);
        int rightIndex = Math.max(peakIndex, valleyIndex);

        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

        }
        return count;
    }

    
}