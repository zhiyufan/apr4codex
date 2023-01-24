package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
    	String[] s = {"1010","1011","0100","0101","1111"};
    	findDifferentBinaryString(s);
    }
    
    public static String findDifferentBinaryString(String[] nums) {
        
        int[][] counts = new int[nums.length][nums[0].length()];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[i][j] += 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < nums[0].length(); j++) {
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                count += counts[i][j];
            }
            sb.append(count * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}