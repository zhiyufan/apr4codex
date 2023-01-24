package com.codex;

import java.util.*;

public class Solution {
        int[] result = new int[length];
        int less = 0;
        int greater = length - 1;
        for (int i = 0; i < length; i++) {
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

    
}