package com.codex;

import java.util.*;

public class Solution {
//2017-09-26
    public static int minStoneSum(int[] piles, int k) {
        //使用二分搜索
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