package com.codex;

import java.util.*;

public class Solution {
    public static String minDeletion(int[] nums) {
        
        String result = "";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                set.add((char) nums[i]);
                set.add((char) nums[i + 1]);
            }
        }
        if (nums.length % 2 == 1) {
            set.add((char) nums[nums.length - 1]);
        }
        for (Character c : set) {
            result += c;
        }
        return result;
    }

    
}