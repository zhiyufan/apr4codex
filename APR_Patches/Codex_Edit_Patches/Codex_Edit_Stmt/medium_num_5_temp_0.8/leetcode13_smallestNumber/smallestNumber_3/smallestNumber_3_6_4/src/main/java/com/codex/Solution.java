package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add((int) num % 10);
            num /= 10;
        }
        list.sort(Integer::compareTo);
        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }













  /*
    * You are given a number n. You need to find the smallest number that has 
    * same set of digits as n and is greater than n
    */
    public static long smallestNumber(long num) {
      List<Integer> nums = new ArrayList<>();
      while (num != 0) {
        nums.add((int) num % 10);
        num /= 10;
      }
      return smallest(nums, nums.size() - 1);
    }
    
    private static long smallest(List<Integer> nums, int index) {
      if (index <= 0 || nums.get(index - 1) < nums.get(index)) {
        return listToNumber(nums);
      }
      
      int i = index;
      while (i > 0 && nums.get(i - 1) == nums.get(i)) {
        i--;
      }
      i--;

      if (nums.get(i) > nums.get(index)) {
        swap(nums, i, index);
        return listToNumber(nums);
      }
      
      int nextSmallestIndex = findNextSmallest(nums, i);
      swap(nums, i, nextSmallestIndex);
      Arrays.sort(nums.subList(i + 1, nums.size()).toArray());
      return listToNumber(nums);
    }
    
    private static int findNextSmallest(List<Integer> nums, int index) {
      int nextSmallest = Integer.MAX_VALUE;
      int nextSmallestIndex = -1;
      for (int i = index + 1; i < nums.size(); i++) {
        if (nums.get(i) < nextSmallest && nums.get(i) > nums.get(index)) {
          nextSmallest = nums.get(i);
          nextSmallestIndex = i;
        }
      }
      return nextSmallestIndex;
    }
    
    private static long listToNumber(List<Integer> nums) {
      long l = 0;
      for (int i = 0; i < nums.size(); i++) {
        l += nums.get(i) * (long) Math.pow(10, i);
      }
      return l;
    }
    
    private static void swap(List<Integer> nums, int i, int j) {
      int temp = nums.get(i);
      nums.set(i, nums.get(j));
      nums.set(j, temp);
    }
    
}