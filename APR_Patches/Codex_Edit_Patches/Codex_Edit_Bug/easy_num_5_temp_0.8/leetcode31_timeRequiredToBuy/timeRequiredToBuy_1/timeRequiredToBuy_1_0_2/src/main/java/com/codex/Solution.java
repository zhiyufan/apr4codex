package com.codex;

import java.util.*;

public class Solution {


    public static int timeRequiredToBuy(int[] tickets, int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tickets.length; ++i) {
            if (tickets[i] > max) {
                max = tickets[i];
            }
            left += tickets[i];
        }
        if (k >= left) {
            return max;
        }
        int lo = 0;
        int hi = max;
        int res = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < tickets.length; ++i) {
                cnt += tickets[i] / mid;
            }
            if (cnt < k) {
                hi = mid - 1;
            } else {
                if (tickets[k] % mid != 0) {
                    lo = mid + 1;
                    res = Math.min(res, mid);
                } else {
                    hi = mid - 1;
                }
            }
        }
        return res;
    }




    
}