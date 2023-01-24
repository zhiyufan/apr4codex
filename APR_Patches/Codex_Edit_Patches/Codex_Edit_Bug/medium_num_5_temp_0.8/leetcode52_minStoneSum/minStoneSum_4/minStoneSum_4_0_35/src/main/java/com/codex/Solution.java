package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int K) {
        
        int low = 0, high = 0;
        for(int pile : piles) {
            high += pile;
        }
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canGet(piles, K, mid)) high = mid;
            else low = mid + 1;
        }
    }

    private static boolean canGet(int[] piles, int k, int cap) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / cap;
        }
        return count >= K;
    }
}