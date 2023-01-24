package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(int[] nums, int target) {
        
                int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                    }
                }
            }
        }
        return count/2;
    }

   
    public class temp {
  public static void main(String[] args) {
    int[] nums = {10,20,10,20,30,40,10,10};
    int target = 50;

    System.out.println(numOfPairs(nums, target));
  }
}
}