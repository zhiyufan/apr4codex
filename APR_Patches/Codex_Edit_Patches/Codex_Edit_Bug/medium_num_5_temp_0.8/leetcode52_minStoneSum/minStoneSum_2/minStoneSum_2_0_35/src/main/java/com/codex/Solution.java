package com.codex;

import java.util.*;

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = Arrays.stream(piles).sum();
        int left = sum / k;
        int right = sum;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1;
            }
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    
}