package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];
        }
        while (max <= sum) {
            int mid = max + (sum - max) / 2;
            if (canGet(piles, mid, k)) {
                sum = mid - 1;
            } else {
                max = mid + 1;
            }
        }
        return max;
    }

    private static boolean canGet(int[] piles, int mid, int k) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / mid;
        }
        return count >= k;
    }

    public static int minStoneSum(int[] piles, int k) {
        
        int left = 0, right = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > right) right = piles[i];
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
            count += piles[i] / mid;
        }
        return count >= k;
    }

    
}