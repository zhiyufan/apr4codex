package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {


        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int digit = 0;
            while (temp > 0) {
                digit++;
                temp = temp / 10;
            }
            int index = 0;
            while (digit > 0) {
                index += (Math.pow(10, digit - 1) * mapping[nums[i] % 10]);
                nums[i] = nums[i] / 10;
                digit--;
            }
            res[i] = index;
        }
        Arrays.sort(res); 
        return res;
    }
}