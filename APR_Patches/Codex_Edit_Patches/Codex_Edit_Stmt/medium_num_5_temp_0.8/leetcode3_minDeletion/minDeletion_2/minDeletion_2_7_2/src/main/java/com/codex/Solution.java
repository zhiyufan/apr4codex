package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        for (int i = 0; i < nums.length; ) {
            if (i % 2 == 0 && i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
                i = i + 2;
            } else {
                if (i < nums.length - 2 && nums[i] == nums[i + 2]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                }
                i = i + 3;
            }
        }

        int min = 0;
        int max = nums.length - 1;
        while (nums[min] == nums[min + 1]) {
            min++;
        }        
        while (nums[max] == nums[max - 1]) {
            max--;
        }        

        min++;
        max--;

        return max - min;
    }

        
}