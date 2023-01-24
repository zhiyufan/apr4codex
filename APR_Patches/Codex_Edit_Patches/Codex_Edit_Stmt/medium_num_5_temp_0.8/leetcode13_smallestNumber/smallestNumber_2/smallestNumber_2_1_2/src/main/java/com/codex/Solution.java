package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Long> nums = new ArrayList<>();
        while (n > 0) {
            nums.add(n % 10);
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
        for (Long i : nums) {
            n = 10 * n + i;
        }
        return n;
    }

    
    public static long smallestNumber(long num) {
        
        long n = num;
        int[] nums = new int[9];
        int index = 0;
        while (n > 0) {
            nums[index++] = (int) (n % 10);
            n = n / 10;
        }
        Arrays.sort(nums);
        if (nums[0] == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[0];
                    nums[0] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = 10 * n + nums[i];
        }
        return n;
    }





        ArrayList<Long> nums = new ArrayList<>();
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