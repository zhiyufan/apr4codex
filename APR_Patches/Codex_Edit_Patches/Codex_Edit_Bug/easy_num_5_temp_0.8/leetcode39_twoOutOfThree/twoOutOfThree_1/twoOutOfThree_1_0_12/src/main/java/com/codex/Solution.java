package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int length = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                ++j;
                --length;
            }
            if (j < nums.length) {
                ++count;
                nums[i + 1] = nums[j];
                int k = i + 1;
                for (j = j + 1; j < nums.length; ++j) {
                    nums[k+1] = nums[j];
                    ++k;
                }
            }
        }
       
        return length;
    }

}
}