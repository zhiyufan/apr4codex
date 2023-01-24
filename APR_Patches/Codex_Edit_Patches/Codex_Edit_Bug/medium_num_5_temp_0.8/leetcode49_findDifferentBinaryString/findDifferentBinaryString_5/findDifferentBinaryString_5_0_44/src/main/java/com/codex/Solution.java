package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
  if (nums == null || nums.length == 0) {
    return null;
  }
  int[] counts = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    char[] current = nums[i].toCharArray();
    for (int j = 0; j < current.length; j++) {
      if (current[j] == '1') {
        counts[j]++;
      }
    }
  }
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < counts.length; i++) {
    if (counts[i] * 2 > nums.length) {
      sb.append("0");
    } else {
      sb.append("1");
    }
  }
  return sb.toString();
}

    
 
    
    
    
    
    
    
    public double getMedian(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0.0;
            }
        return getMedian(nums, 0, nums.length - 1, (nums.length + 1)/2);
    }
    
    public double getMedian(int[] nums, int start, int end, int length) {
        if (start > end) {
            return 0.0;
        } 
        int mid = partition(nums, start, end);
        if (mid == length) {
            if (nums.length % 2 == 0) {
                return nums[mid - 1] + nums[mid];
            } else {
                return nums[mid];
            }
        } else if (mid < length) {
            return getMedian(nums, mid + 1, end, length - mid - 1);
        } else {
            return getMedian(nums, start, mid - 1, length);
    }

    }
    public int partition(int[] nums, int start, int end) {
      Random rand = new Random();
      int index = rand.nextInt(end - start + 1) + start;
      swap(nums, index, end);
      int small = start - 1;
      for (int i = start; i <= end; i++) {
        if (nums[i] < nums[end]) {
            small++;
            if (small != i) {
                swap(nums, small, i);
            }
        }
      }
      small++;
      swap(nums, small, end);
      return small;
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}