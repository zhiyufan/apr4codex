package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        int[] nums = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            nums[i] = Integer.parseInt(bank[i], 2);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j < bank.length; j++) {
                int tmp = nums[j];
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }
}