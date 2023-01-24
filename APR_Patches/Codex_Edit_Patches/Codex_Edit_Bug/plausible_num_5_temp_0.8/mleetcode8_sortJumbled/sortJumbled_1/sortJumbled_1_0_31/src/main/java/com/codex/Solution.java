package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
      

        int[] res = new int[nums.length];
            res[i] = mapping[nums[i]];
        }
        Arrays.sort(res); 
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (res[i] < res[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

    
}