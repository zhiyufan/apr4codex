package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

   public static int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] chars_arr = new int[128];
        for (char c : chars.toCharArray()) {
            chars_arr[c]++;
        }
        for (String str : words) {
            int[] copy_chars = chars_arr.clone();
            boolean is_good = true;
            for (char c : str.toCharArray()) {
                if (--copy_chars[c] < 0) {
                    is_good = false;
                    break;
                }
            }
            res += is_good ? str.length() : 0;
        }
        return res;
    }
    
}