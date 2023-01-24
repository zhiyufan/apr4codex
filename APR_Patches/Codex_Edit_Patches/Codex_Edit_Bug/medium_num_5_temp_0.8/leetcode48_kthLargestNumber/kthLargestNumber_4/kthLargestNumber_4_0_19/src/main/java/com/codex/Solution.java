package com.codex;

import java.util.*;

public class Solution {
    public static String largestNumber(int[] nums) {
        

        if (nums == null || nums.length == 0) {
            return "";
        }

        String[] numbers = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // if the largestDigit is 0, return 0
        if (numbers[0].charAt(0) == '0') return "0";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }

        return sb.toString();

    }
    
}