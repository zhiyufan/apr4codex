package com.codex;

import java.util.*;

public class Solution {
class Solution {
    
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) {
                    count++;
                }
            }
        }
        return count;
    }

}
}