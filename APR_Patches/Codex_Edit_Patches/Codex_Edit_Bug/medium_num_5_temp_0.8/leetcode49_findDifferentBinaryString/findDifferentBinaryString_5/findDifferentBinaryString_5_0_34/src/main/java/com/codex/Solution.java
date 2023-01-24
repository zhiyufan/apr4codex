package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
        
    int[] counts = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        char[] current = nums[i].toCharArray();
        for (int j = 0; j < current.length; j++) {
            if (current[j] == '1') {
                counts[j]++;
            }
        }
    }
    return findString(counts, nums.length);
}

private static String findString(int[] counts, int length) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < counts.length; i++) {
        if (counts[i] * 2 > length) {
            sb.append('0');
        } else if (counts[i] * 2 < length) {
            sb.append('1');
        } else {
            int[] newCounts = Arrays.copyOf(counts, counts.length);
            newCounts[i] = 0;
            sb.append(findString(newCounts, length));
            break;
        }
    }

    return sb.toString();
}
}