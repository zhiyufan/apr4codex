package com.codex;

import java.util.*;

public class Solution {
class findDifferentBinaryString {
    public static String findDifferentBinaryString(String[] nums) {  
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        if(nums.length == 0 || nums == null) return "";

        for(String num : nums) {
            for(int i = 0; i < num.length(); i++) {
                if(num.charAt(i) == '0') row[i]++;
                else col[i]++;
            }
        }

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}