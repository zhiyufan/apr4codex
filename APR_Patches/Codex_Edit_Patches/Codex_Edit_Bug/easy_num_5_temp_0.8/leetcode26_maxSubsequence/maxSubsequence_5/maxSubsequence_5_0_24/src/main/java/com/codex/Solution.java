package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.size() == 0)
            return -1;
        int majority = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (count == 0) {
                majority = nums.get(i);
                count = 1;
            } else if (majority == nums.get(i)) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
}