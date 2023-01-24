package com.codex;

import java.util.*;

public class Solution {
     class MinBitFlips {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0};
        System.out.println(minBitFlips(nums));
    }

    public static int minBitFlips(int[] nums) {
        
        int flips = 0, cur = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cur++;
                if (cur == 1) {
                    ans++;
                }
            } else {
                cur--;
                if (cur == -1) {
                    ans++;
                    cur = 0;
                }
            }
        }
        return flips + left - 1;
    }
    
}