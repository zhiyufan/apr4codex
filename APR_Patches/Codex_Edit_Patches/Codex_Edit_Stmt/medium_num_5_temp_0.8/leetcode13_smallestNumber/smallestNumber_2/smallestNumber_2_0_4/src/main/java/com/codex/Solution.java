package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(nums);
        while (nums.get(0) == 0) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) != 0) { // if (nums.get(0) != 0) break;
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