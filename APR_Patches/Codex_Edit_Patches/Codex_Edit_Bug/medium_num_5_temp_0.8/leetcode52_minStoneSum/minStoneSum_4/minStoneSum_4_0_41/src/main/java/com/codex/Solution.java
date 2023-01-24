package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
        int left = 0, right = 0;
        for (int i = 0; i < piles.length; i++) {
            right = Math.max(piles[i], right);
            left += piles[i];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canGet(piles, k, mid)) right = mid;
            else left = mid + 1;
        }
        return right;
    }

    private static boolean canGet(int[] piles, int k, int mid) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += (int) Math.ceil(piles[i] / (double)mid);
        }
        return count >= k;
    }

    
}