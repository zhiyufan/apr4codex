package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

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



    public static int findMaxDistance(int[] nums) {
        if (nums == null || nums.length == 0) {
          return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
           for (int j = i + 1; j < nums.length; j++) {
              if (nums[i] > nums[j] && j - i > max) {
                  max = j - i;
              }
           }
        }
        return max;
    }


    public static int findMaxDistance(int[] nums) {
        if (nums == null || nums.length == 0) {
          return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && i + 1 - i > max) {
                max = i + 1 - i;
            }
        }
        return max;
    }


    public static int findMaxDistance(int[] nums) {
        if (nums == null || nums.length == 0) {
          return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j] && j - i > max) {
                    max = j - i;
                }
            }
        }
        return max;
    }
}