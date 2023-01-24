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


    public static int minStoneSumGreedy(int[] piles, int k) {
        int res = 0;
        for (int pile : piles) {
            res += pile;
        }

        int low = 0;
        int high = 0;
        for (int pile : piles) {
            low = Math.max(low, pile);
            high += pile;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1;
            }
            if (count >= k) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
        return left;
    }

    
}