package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i == (nums.length-1)){
                break;
            }
            if ((nums[i] + 1) == nums[i+1]) {
                result++;
            }
        }
        return result;
    }

    
}