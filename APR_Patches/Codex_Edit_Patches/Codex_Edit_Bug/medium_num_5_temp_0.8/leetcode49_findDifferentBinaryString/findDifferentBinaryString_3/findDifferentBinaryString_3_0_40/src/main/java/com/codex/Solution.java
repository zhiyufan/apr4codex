package com.codex;

import java.util.*;

public class Solution {
public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        String s = "";
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (String str : nums) {
                count += str.charAt(i) - '0';
            }
            if (count <= nums.length / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

}
}