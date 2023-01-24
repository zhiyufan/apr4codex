package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) { //最小的数是原数组中的最小数，进行空操作
                return "1" + nums[i];
            } else if (i == nums.length - 1 && nums[i].equals(nums[i - 1] + "0")) { //最大的数是原数组中的最大数，进行空操作
                return nums[i] + "1";
            } else if (i != 0 && i != nums.length - 1 && nums[i].equals(nums[i - 1] + "0") && nums[i].equals("0" + nums[i + 1])) { //在中间间断时，进行空操作
                return nums[i] + "1";
            }
        }
        return "";
    }

    
}