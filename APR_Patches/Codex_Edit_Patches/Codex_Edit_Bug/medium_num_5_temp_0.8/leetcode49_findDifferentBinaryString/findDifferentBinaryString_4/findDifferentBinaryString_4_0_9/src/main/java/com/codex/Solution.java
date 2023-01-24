package com.codex;

import java.util.*;

public class Solution {
    package com.src.practice;

    import java.util.Arrays;

    public class FindDifferentString {

        public static void main(String[] args) {
            String[] nums = { "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "1000000000000000000",
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "1000000000000000000",
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "1000000000000000000",
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111", 
                              "111111111111111111"};

            String result = findDifferentBinaryString(nums);

            System.out.println(result);
        }

    public static String findDifferentBinaryString(String[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }

        int[] ones = new int[nums[0].length()];
        int[] zeros = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') zeros[i]++;
                else ones[i]++;

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