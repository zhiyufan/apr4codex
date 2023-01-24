package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
        int one = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i].length() > nums[i + 1].length()) {
                    return "1" + nums[i];
                } else if (nums[i].equals(nums[i + 1])) {
                    one = 1;
                }
            } else if (i == nums.length - 1) {
                if (nums[i].length() > nums[i - 1].length()) {
                    return "1" + nums[i];
                } else if (nums[i].equals(nums[i - 1])) {
                    one = 1;
                }
            } else if (i != 0 && nums[i].length() > nums[i - 1].length() && nums[i].length() > nums[i + 1].length()) {
                if (!nums[i].equals(nums[i - 1]) && !nums[i].equals(nums[i + 1])) {
                    one = 1;
                }
            } else if (i != 0 && nums[i].length() > nums[i - 1].length() && nums[i].equals(nums[i + 1])) {
                if (!nums[i].equals(nums[i - 1])) {
                    one = 1;
                }
            } else if (i != 0 && nums[i].length() > nums[i + 1].length() && nums[i].equals(nums[i - 1])) {
                if (!nums[i].equals(nums[i + 1])) {
                    one = 1;
                }
            } else if (i != 0 && nums[i].equals(nums[i - 1]) && nums[i].equals(nums[i + 1])) {
                one = 1;
            }
        }
        return one == 1 ? "1" + nums[i - 1] : "1" + nums[i];
    }
}