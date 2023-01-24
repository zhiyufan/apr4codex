package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] test = new String[] { "1101", "0000", "1101", "1100", "1101" };
        System.out.println(findDifferentBinaryString(test));
    }

    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums[0].length()];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {   
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');  // Return 0 if sum is greater than or equal to number of elements. Otherwise return 1.
        }
        return sb.toString();
    }

    
}