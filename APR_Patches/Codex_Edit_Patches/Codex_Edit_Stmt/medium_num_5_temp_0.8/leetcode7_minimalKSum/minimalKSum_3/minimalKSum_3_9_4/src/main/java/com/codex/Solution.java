package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] result = new int[2];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                result[0] = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                result[1] = i + 2;
                break;
            }
        }

        if (result[1] == 0) {
            result[1] = nums[0] == 1 ? nums[nums.length - 1] + 1 : nums[0] - 1;
        }

        return result
    }

}
    
    
}