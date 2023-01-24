package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int tempStart = start;
        int tempGoal = goal;
        int count = 0;
        while (tempStart > 0) {
            int startBit = tempStart & 1;
            int goalBit = tempGoal & 1;
            tempStart = tempStart >> 1;
            tempGoal = tempGoal >> 1;
            count++;
            if (startBit != goalBit) {
                flips++;   
            }
        }
        return flips + count - 1;
    }
    
}