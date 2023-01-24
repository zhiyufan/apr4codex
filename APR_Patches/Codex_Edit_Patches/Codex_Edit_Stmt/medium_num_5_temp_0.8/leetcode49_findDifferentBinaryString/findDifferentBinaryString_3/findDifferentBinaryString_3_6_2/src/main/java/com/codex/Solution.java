package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int len = nums[0].length();
        int[] counter = new int[len];
        for (String num : nums) {
            for (int i = len - 1; i >= 0; i--)
                if (num.charAt(i) == '1')
                    counter[len - 1 - i]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(counter[i] > nums.length / 2 ? '1' : '0');
        return sb.toString();

    }
}