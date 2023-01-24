package com.codex;

import java.util.*;

public class Solution {
public int beautiful(int[] arr){
  int result = 0;
  for(int i=0;i<arr.length;i++) {
    boolean isBeautiful = true;
    for(int j=0;j<i;j++) {
      if(arr[j] >= arr[i]) {
        isBeautiful = false;
        break;
      }
    }
    for(int j=i+1;j<arr.length;j++) {
      if(arr[j] >= arr[i]) {
        isBeautiful = false;
        break;
      }
    }
    if(isBeautiful) {
      result = result + arr[i];
    }
  }
  return result;
}

public int sumOfBeauties(int[] nums) {
        
  int sum = 0;
  for(int i = 1; i < nums.length - 1; i++) {
    if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
      sum += 1;
    } else {
      int j = i - 1;
      int k = i + 1;
      while(j >= 0) {
        if(nums[i] > nums[j]) {
          break;
        }
        j--;
      }
      while(k < nums.length) {
        if(nums[i] > nums[k]) {
          break;
        }
        k++;
      }
      if(j < 0 && k >= nums.length) {
        sum += 2;
      }
    }

  }
  return sum;
}
}