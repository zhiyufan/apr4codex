package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {//does not work for negative numbers
        
        long n = Math.abs(num);
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
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
        long nn = 0;
        for (int i = 0; i < nums.size(); i++) {
            nn = 10 * nn + nums.get(i);
        }
        n = num < 0 ? -nn : nn;
        return n;
    }

    
}