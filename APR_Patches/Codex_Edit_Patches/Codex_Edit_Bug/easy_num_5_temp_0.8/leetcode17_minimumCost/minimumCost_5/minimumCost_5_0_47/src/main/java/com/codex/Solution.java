package com.codex;

import java.util.*;

public class Solution {
    public static int minCost(int[] costs) {
        
        if (costs.length == 0)
            return 0;
    
        int prevRed = costs[0];
        int prevBlue = 0;
        int prevGreen = 0;

        for (int i = 1; i < costs.length; i++) {
            int currRed = costs[i] + Math.min(prevBlue, prevGreen);
            int currBlue = costs[i] + Math.min(prevRed, prevGreen);
            int currGreen = costs[i] + Math.min(prevRed, prevBlue);
            prevRed = currRed;
            prevBlue = currBlue;
            prevGreen = currGreen;
            costs[i] = Math.min(currRed, Math.min(currBlue, currGreen));
        }
        return costs[costs.length - 1];
    }

    
}