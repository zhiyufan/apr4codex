package com.codex;

import java.util.*;

public class Solution {
    public static int smallestNumber(int num) {
        
        int n = num;
        int temp = n;
        int c = 1;
        int[] nums = new int[10];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            nums[i] = 0;
        }
        while (n > 0) {
            int d = n % 10;
            nums[d]++;
            n = n / 10;
        }
        int i = 1;
        while (nums[i] == 0) {
            i++;
        }
        if (i == 0) {
            return -1;
        }
        nums[i]--;
        n = i;
        while (c < temp) {
            int j = 0;
            while (nums[j] == 0) {
                j++;
            }
            n = n * 10 + j;
            nums[j]--;
            c *= 10;
        }
        return n;
    }

    







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

    
}