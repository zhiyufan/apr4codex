package com.codex;

import java.util.*;

public class Solution {
     public static int minDeletion(int[] nums) {
        
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }

        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                maxLength = Math.max(maxLength, count);
            } else {
                count = 0;
            }
        }

        

        int counter = 0;
        for (int i = array.length -1; i >= 0; i--) {
            if (array[i] == -1) {
                counter++;
                maxLength = Math.max(counter, maxLength);
            } else {
                counter = 0;

        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]) {
                count++;
            }
        }
        int length = 0;
        if (count != 0) {
            length = count + maxLength;
        } else {
            length = nums.length;
        }


            }
        }
        return count;
    }
  
}