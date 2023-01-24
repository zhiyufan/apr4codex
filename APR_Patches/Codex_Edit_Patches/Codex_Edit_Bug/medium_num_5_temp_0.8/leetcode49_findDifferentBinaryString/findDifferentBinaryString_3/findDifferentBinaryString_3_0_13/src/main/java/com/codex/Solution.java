package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        int[] count = new int[n];
        for (String s : nums) {
            for (int j = 0; j < n; ++j) {
                count[j] += s.charAt(j) - '0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append((count[i] < 2) ? '1' : '0');
        }
        return s;
    }

    
}