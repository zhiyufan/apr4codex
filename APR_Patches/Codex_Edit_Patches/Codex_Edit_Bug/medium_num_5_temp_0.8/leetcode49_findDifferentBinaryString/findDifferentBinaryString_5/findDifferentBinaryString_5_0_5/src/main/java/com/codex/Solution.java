package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int singleNumber(int[] nums) {
        int[] result = new int[32];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                int mask = (1 << j);
                result[j] += ((nums[i] & mask) != 0) ? 1 : 0;
            }
        }
        for (int i = 0; i < 32; i++) {
            total += (result[i] % 3) << i;
        }
        return sb.toString();
    }

    
}