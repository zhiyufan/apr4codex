package com.codex;

import java.util.*;

public class Solution {
public class HillValley {

    public static String countHillValley(int[] v) {
        
        int count = 0;
        for (int i = 1; i < v.length - 1; i++) {

            if (v[i - 1] < v[i] && v[i] > v[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}