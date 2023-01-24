package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }
  public static void sortColors(int[] nums) {
        int[] color = new int[3];
        for (int i : nums) {
            color[i]++;
        }
        int n = 0;
        for (int i = 0; i < color.length; ++i) {
            for (int j = 0; j < color[i]; ++j) {
                nums[n++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }


    
}