package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] array) {
        
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        int nowmin = array[0];
        int nowmax = array[array.length - 1];
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > nowmin) {
                left[i] = 1;
            }
            nowmin = Math.min(array[i], nowmin);
            if (array[array.length - 1 - i] < nowmax) {
                right[array.length - 1 - i] = 1;
            }
            nowmax = Math.max(array[array.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}