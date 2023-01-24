package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;

    public static List<String> filterShortWords(List<String> words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() < len) {
                result.add(word);
            }
        }
        return result;
    }

    
    }

    
}