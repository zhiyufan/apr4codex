package com.codex;

import java.util.*;

public class Solution {
        // Sorting the array
        Arrays.sort(array);
        int n = array.length;
        // Iterating the array
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == sum)
                        return new int[]{array[i], array[j], array[k]};
                } 
            }
        }
        return new int[0];
    }
}