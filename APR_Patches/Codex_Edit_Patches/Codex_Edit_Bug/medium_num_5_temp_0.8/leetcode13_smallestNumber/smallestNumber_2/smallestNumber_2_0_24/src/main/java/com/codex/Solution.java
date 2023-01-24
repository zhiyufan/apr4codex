package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        long n = num;
        String s = String.valueOf(n);
        boolean works = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                works = false;
                break;
            }
        }
        Collections.sort(nums);
        if (nums.get(0) == 0) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) != 0) {
                    int temp = nums.get(0);
                    nums.set(0, nums.get(i));
                    nums.set(i, temp);
                    break;
                }
            }
        }
        n = 0;
        for (int i = 0; i < nums.size(); i++) {
            n = 10 * n + nums.get(i);
        }
        return n;
    }

    
}