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
            int sum = 0;
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (sum + pile - 1) / mid + 1;
                sum = (sum + pile) % mid;
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
}