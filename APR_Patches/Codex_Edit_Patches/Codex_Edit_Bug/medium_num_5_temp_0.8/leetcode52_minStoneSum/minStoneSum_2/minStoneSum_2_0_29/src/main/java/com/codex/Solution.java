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
                count += pile / mid;
                if (pile % mid > 0) {
                    count++;
                }
            }
            if (count <= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left * k;
    }

    
}