package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k, int n) {
        
        int left = 0;
        int right = 0;
        for (int pile : piles) {
            right += pile;
            left = Math.min(left, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                if (pile >= mid)
                    count += (pile - mid) / mid + 1;
            }
            if (count <= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}