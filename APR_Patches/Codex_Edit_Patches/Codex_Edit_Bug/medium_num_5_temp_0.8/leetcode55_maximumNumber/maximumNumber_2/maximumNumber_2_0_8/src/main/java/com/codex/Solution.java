package com.codex;

import java.util.*;

public class Solution {
class Solution {
    
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
            } else if(nums[i] == nums[nums[i]]) {
                return nums[i];
            } else {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return -1;
    }

}
}