package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] stones, int k) {
        
        int left = 0;
        int right = 0;
        for (int pile : stones) {
            right += pile;
            left = Math.max(left, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : stones) {
                count += (pile - 1) / mid + 1;
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