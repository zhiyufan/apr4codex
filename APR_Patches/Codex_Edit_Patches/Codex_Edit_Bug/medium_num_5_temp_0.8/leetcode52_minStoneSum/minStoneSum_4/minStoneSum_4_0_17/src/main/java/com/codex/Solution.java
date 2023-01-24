package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;

    public static int minStoneSum(int[] piles, int k) {
        if (piles == null || piles.length == 0) return 0;
        int left = 1, right = 0;
        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canGet(piles, mid, k)) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    private static boolean canGet(int[] piles, int mid, int k) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / mid;
        }
        return count >= k;
    } 
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int k = 8;
        System.out.println(minStoneSum(piles, k));
    }

    
}