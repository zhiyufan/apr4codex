package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
        int left = 0;
        int right = 0;
        for (int pile : piles) {
            right += pile;
            left = Math.max(left, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1;
            }
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int max = 0, sum = 0;
        for (int n : piles) {
            max = Math.max(max, n);
            sum += n;
        }

        int left = max;
        int right = sum;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(piles, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    private static boolean canSplit(int[] piles, int k, int threshold) {
        int count = 0;
        for (int n : piles) {
            count += (n - 1) / threshold + 1;
        }
        return count <= k;

        return left;
    }

    
}