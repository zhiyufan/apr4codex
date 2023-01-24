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
    public static long smallestNumber(long num) {
        
        long temp = num;
        long n = 0;
        long[] count = new long[10];
        while (temp > 0) {
            int rem = (int)(temp % 10);
            count[rem]++;
            temp = temp / 10;
        }
        for (int i = 1; i < 10; i++) {
            if (count[i] != 0) {
                n = n * 10 + i;
                count[i]--;
                break;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            while (count[i] > 0) {
                n = n * 10 + i;
                count[i]--;
            }
        }
        return n;
    }

    
}