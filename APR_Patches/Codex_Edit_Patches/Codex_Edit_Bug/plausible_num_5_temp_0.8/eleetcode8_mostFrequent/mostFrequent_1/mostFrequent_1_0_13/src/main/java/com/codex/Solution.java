package com.codex;

import java.util.*;

public class Solution {
    // The most frequent num in an array
    public static int mostFrequent(int[] nums, int key) {
        

        int count = 0;
        int maxCount = 0;
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i + 1]) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    target = nums[i + 1];
                }
            }
        }

        return target;
    }

    // The most frequent char in a string
    public static char mostFrequent(String str) {
        char[] charArray = str.toCharArray();
        char maxChar = ' ';
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    if (count > maxCount) {
                        maxChar = charArray[i];
                        maxCount = count;
                    }
                }
                count = 0;
            }
        }

        return maxChar;
    }
}