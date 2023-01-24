package com.codex;

import java.util.*;

public class Solution {
public class YourClassNameHere {
    public static void main(String[] args) {
      int[] nums = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
      int first = Integer.MAX_VALUE;
      int second = Integer.MAX_VALUE;
      int third = Integer.MAX_VALUE;

      for(int i=0;i<nums.length;i++){
        int cur = nums[i];
        if(cur <= first){
          third = second;
          second = first;
          first = cur;
        }
        else if(cur <= second){
          third = second;
          second = cur;
        }
        else if(cur <= third){
          third = cur;
        }
      }

      if(third != Integer.MAX_VALUE)
        System.out.println(third);
      else
        System.out.println(-1);
    }
}
        


    
}