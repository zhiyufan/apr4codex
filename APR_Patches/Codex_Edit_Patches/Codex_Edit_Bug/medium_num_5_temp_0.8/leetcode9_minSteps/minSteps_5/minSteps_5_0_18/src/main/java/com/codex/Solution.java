package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int i = 0;
        while(i < nums.length){
            int j = i + 1;
            while(j < nums.length){
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    
}