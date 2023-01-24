package com.codex;

import java.util.*;

public class Solution {
public static int minStoneSum(int[] piles, int k) {
        
        int left = 0;
        int right = 0;
        for (int p : piles) {
            right+=p;
            left = Math.max(left, p);
        }

        while (left < right) {
            int mid = left + (right-left)/2;
            int count = 0;
            for (int p : piles) {
                count+=(p - 1) / mid + 1;
            }
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

      
}