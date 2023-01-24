package com.codex;

import java.util.*;

public class Solution {
public static int findSum(int[] digits) {
        
        int result = 0;
        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    result += num;
                }
            }
        }
        return result;
    }

    
}