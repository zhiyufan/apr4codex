package com.codex;

import java.util.*;

public class Solution {
int countElements(int[] nums) {
        String result = "";
        String temp = "";
        String string1 = "";
        String string2 = "";
        String string3 = "";

        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
        }
        System.out.println(temp);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) result += nums[i];
            else if (nums[i] == 0) result += nums[i];
        }
        return result;
    }
}