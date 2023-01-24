package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) count++;
            }
        }
        return count;
    }
    public static String box(int width, String word) {
        String result = "";
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == width - 1) {
                    result += "*";
                } else {
                    if (j == 0 || j == width - 1) {
                        result += "*";
                    } else {
                        result += word;
                    }
                }
            }
            result += "\n";
        }
        return result;
    }


    
}