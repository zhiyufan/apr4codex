package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {  // 0, 1, 2, 3, 4
        
        int left = 0;
        int right = 0;
        for (int pile : piles) {
            right += pile;
            left = Math.max(left, pile);
        }

        while (left < right) { // left = 3, right = 12;
            int mid = left + (right - left) / 2; // mid = 3 + 12 / 2 = 7;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1; // count = 0 + 3 / 7 + 1 = 1 + 1 = 2
            }
            if (count <= k) { // count = 2 <= 4
                right = mid;
            } else {
                left = mid + 1; // right = 7 + 1 = 8;
            }
        }

        return left; // left = 3
    }

    
}