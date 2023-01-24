package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 2; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = Math.max(result, j - i - 1);
                }
            }
        }
        return result;
    }

    
}