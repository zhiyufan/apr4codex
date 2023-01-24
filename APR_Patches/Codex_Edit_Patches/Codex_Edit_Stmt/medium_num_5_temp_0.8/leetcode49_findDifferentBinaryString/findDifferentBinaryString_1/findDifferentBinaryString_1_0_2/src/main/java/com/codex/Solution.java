package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        // 设置默认值，若没有符合的数返回空串
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) {
                res = "1" + nums[i];
                break;
            } else if (i == nums.length - 1 && nums[i].equals(nums[i - 1] + "0")) {
                res = nums[i] + "1";
                break;
            } else if (i != 0 && nums[i].equals(nums[i - 1] + "0") && nums[i].equals("0" + nums[i + 1])) {
                res = nums[i] + "1";
                break;
            }
        }
        return res;
    }

    
}