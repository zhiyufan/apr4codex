package com.codex;

import java.util.*;

public class Solution {
    public static List<String> isSubsequence(String s, List<String> words) {
        // Write your code here
        List<String> result = new ArrayList<>();
        if (s == null || words == null || words.size() == 0) {
            return result;
        }

        //check the first word is subsequence of s and add the result in a list
        for (int i = 0; i < words.size(); i++) {
            char[] temp = words.get(i).toCharArray();

            int index = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == temp[index]) {
                    index++;
                }
                if (index == temp.length) {
                    result.add(words.get(i));
                    break;
                }
            }
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 1) {
                result++;
            }
        }
        return result;
    }

    private static int getNumberOfZeros(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}