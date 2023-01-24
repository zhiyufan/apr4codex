package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] input = {"101", "010", "001"};
        System.out.println(findDifferentBinaryString(input));
    }

    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        int length = nums[0].length();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i].charAt(j) == '1') {
                    counts[j]++;       
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}