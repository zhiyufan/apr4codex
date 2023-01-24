package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class MyClass {
   
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
      int[] arr ={1,2,3,4,5,5,5,7,8,9,9};
      System.out.println(minDeletion(arr));
    }
}
    
}