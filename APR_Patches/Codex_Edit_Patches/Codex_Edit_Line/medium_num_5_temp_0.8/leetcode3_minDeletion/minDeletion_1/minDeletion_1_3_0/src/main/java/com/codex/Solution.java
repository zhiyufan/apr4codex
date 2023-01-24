package com.codex;

import java.util.*;

public class Solution {

// method 1:
    public static int minDeletion(int[] nums) {
    // This is a good solution

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }


// method 2:
// bug in line 12

    public static int minDeletion(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            if ((nums[i-1] % 2 == 0 && nums[i] % 2 == 0) || nums[i-1] % 2 != 0 && nums[i] % 2 != 0){
				count++;
				continue;
			}
            while (j >= 0 && nums[j] %2 == 1 && value < nums[j]) {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = value;
        }
        return count;
    }


}