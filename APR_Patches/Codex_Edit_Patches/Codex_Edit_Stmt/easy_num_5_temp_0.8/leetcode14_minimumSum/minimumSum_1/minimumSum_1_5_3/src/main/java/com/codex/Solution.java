package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;

    public static int minimumSum(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = str.charAt(i) - '0';
        }
        Arrays.sort(nums);
        int first = 0, second = 0;
        for (int i = len - 1; i >= 0; i--) {
            first = first * 10 + nums[i];
            if (i > 0) {
                second = second * 10 + nums[i - 1];
                i--;
            }
        }
        return first + second;
    }
}
    }

    
}