package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] arr, int k) {
        
        int currentMaximum = 0;

        for (int ticket : arr) {
            currentMaximum = Math.max(currentMaximum, ticket);
        }

        if (currentMaximum > k) {
            return currentMaximum * 2 - 1;
        }

        for (int i = 0; i <= k; i++) {
            currentMaximum = Math.max(currentMaximum, arr[i]);
        }

        return currentMaximum * 2 + (k - currentMaximum) + (k - currentMaximum);
    }
}