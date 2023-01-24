package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {

        if(nums==null || nums.length==0) return 0;
        int max = nums[0];
        int min = nums[0];
        int len = nums.length;
        int i=1;
        boolean isUp = false;
        boolean isDown = false;
        boolean isUpAgain = false;
        boolean isDownAgain = false;
        int result = 0;
        while(i<len){
          if(nums[i]>nums[i-1]){
            if(nums[i]>=max) {
              max = nums[i];
            }
            else{
              if(!isDown && !isUpAgain){
                isUp = true;
                isDown = false;
              }
              else{
                if(isUp){
                  if(nums[i]>=min){
                    result++;
                  }
                  else{
                    isDown = true;
                    isDownAgain = true;
                    isUp = false;
                    isUpAgain = false;
                  }
                }
                else if(isDown){
                  if(nums[i]>=max){
                    isUpAgain = true;
                    isDownAgain = false;
                  }
                  else{
                    isDownAgain = true;
                  }
                }
              }
            }
          }
          else if(nums[i]<nums[i-1]){
            if(nums[i]<min) {
              min = nums[i];
            }
            else{
              if(!isUp && !isDownAgain){
                isUp = false;
                isDown = true;
              }
              else{
                if(isDown){
                  if(nums[i]<=max){
                    result++;
                  }
                  else{
                    isUp = true;
                    isUpAgain = true;
                    isDown = false;
                    isDownAgain = false;
                  }
                }
                else if(isUp){
                  if(nums[i]<=min){
                    isUpAgain = false;
                    isDownAgain = true;
                  }
                  else{
                    isDownAgain = true;
                  }
                }
              }
            }
          }
          i++;
        }
        return result;
    }
}