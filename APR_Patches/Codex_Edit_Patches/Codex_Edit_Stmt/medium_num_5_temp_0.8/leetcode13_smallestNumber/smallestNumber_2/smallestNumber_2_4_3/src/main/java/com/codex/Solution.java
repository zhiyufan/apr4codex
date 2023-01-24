package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (num > 0) {
            nums.add((int)(num % 10));
            num = num / 10;
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
        long n = 0;
        for (int i = 0; i < nums.size(); i++) {
            n = 10 * n + nums.get(i);
        }
        return n;
    }

   
}