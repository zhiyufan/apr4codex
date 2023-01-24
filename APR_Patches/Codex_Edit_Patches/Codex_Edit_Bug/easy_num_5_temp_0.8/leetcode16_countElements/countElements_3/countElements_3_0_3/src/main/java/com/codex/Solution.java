package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int next = nums[i] + 1;
            int check = 0;
            for (int j = 0; j < nums.length; j++) 
            {
                if (nums[i] < nums[j] && next == nums[j]) 
                check++;

            }
            if (check > 0) {
                count++;
            }
        }
        return count;
    }

}