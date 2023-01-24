package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minCostToMoveChips(int[] chips) {

        int N = piles.length;
        int dp0 = 0;
        int dp1 = 0;
        for (int i = 0; i < N; i++)
        if (chips[i] % 2 == 0)
            dp0++;
        else
            dp1++;
        return Math.min(dp0, dp1);
    }
}
}