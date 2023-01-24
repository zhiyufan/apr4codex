package com.codex;

import java.util.*;

public class Solution {
	
	int result = 0;
    public static int countElements(int[] nums) {
        

       
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    
}