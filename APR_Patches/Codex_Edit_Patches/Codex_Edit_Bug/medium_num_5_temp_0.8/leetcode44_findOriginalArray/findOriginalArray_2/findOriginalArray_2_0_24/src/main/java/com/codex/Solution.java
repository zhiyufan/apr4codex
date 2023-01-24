package com.codex;

import java.util.*;

public class Solution {
            public static int[] findOriginalArray(int[] changed) {
        
            List<Integer> missingList = new ArrayList<>();
            for (int i = 1; i <= changed.length; i++) {
                missingList.add(i);
            }
            for (Integer num : changed) {
                missingList.remove(num);
            }
            int[] result = new int[missingList.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = missingList.get(i);
            }
            return result;
        }
}