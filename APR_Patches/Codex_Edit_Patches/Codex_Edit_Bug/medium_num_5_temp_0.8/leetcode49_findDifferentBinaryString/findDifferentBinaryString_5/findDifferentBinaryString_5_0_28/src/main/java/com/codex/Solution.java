package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] numbers = new String[]{"111011", "111011"};
        System.out.println(findDifferentBinaryString(numbers));
    }

    public static String findDifferentBinaryString(String[] nums) {
        int[] counts = new int[nums[0].length()];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();            
            for (int j = 0; j < current.length; j++) {                
                counts[j] += current[j] == '1' ? 1 : -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {            
            sb.append(Math.abs(counts[i]) * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}