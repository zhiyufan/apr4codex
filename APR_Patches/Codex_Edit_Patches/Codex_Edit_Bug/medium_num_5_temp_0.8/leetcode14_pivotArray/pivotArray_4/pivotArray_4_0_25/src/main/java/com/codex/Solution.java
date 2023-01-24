package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
    
    int[] result = new int[nums.length];
    int less = 0;
    int greater = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] < pivot) {
            result[less++] = nums[i];
        } else if (nums[i] > pivot) {
            result[greater--] = nums[i];
        }
    }
    while (less <= greater) {
        result[less++] = pivot;
    }
    return result;
}

public static String[] mapPairs(String[] strings) {
    String[] result = new String[strings.length];
    int last = strings.length - 1;
    for (int i = 0; i < strings.length / 2; i++) {
        // is even
        if (i % 2 == 0) {
            result[i] = strings[i + 1];
            result[i + 1] = strings[i];
        } else {
            result[i] = strings[last - 1];
            result[i + 1] = strings[last];
        }
    }

    return result;
}
}