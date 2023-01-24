package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
        if (nums[0].equals("0")) {
            return "1";
        } else if(nums[nums.length - 1].equals("1")) {
            return "0";
        } else {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i].equals("0" + nums[i + 1]) && nums[i].equals(nums[i - 1] + "0")) {
                    return "1" + nums[i];
                }
            }
        }
        return "";
    }
}