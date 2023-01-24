package com.codex;

import java.util.*;

public class Solution {
class Main {
  public static void main(String[] args) {
    
      int[] nums = new int[]{8,2,5,6,7,1,10,13,8,7};
      int pivot = 8;


      pivotArray(nums, pivot);
      printArray(nums);
  }

  public static void printArray(int[] nums){
    for(int num : nums){
      System.out.print(num + " ");
    }
  }

  public static int[] pivotArray(int[] nums, int pivot) {
      
      int n = nums.length;
      int left = 0;
      for(int right = 0; right < n; right++){
        if(nums[right] < pivot){
          swap(nums, left, right);
          left++;
        }
      }
      return nums;
  }

  public static void swap(int[] nums, int index1, int index2){
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
  }

}

    
}