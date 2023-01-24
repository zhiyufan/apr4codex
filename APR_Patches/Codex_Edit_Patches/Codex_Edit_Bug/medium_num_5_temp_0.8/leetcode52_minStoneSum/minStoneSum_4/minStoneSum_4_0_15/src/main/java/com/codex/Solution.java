package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        if(piles.length == 0) return 0;
        int lo = 0, hi = Integer.MAX_VALUE;
        
        while(lo < hi) {
            int x = lo + (hi - lo) / 2;
            if(!possible(piles, H, x))
                lo = x + 1;
            else
                hi = x;
        } 
        
        return lo;
    }

    public boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for(int pile: piles) {
            time += (pile-1) / K + 1;
        }
        return time <= H;
    }

}
}