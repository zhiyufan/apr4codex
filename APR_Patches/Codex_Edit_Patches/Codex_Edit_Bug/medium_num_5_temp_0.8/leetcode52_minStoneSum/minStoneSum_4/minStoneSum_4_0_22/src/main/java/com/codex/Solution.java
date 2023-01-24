package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        Arrays.sort(piles);
        int left = 0, right = piles[piles.length - 1];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canGet(piles, k, mid)) right = mid;
            else left = mid + 1; // If a stone can't be split into k piles, we pick a larger stone.
        }
        return right;
    }

    private static boolean canGet(int[] piles, int k, int mid) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            int split = piles[i] / mid;
            if (split > 0) count += split;
        }
        return count >= k;
    }

    
}