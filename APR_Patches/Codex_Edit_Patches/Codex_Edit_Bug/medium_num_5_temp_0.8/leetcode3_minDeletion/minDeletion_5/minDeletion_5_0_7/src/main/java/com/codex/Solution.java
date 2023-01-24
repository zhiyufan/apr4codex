package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        int temp = nums[0];
        
        for (int i = 1; i < length; i++) {
            if (temp == nums[i]) {
                count++;
            }
            temp = nums[i];
        }
        return count;
    }
}





    
    
}