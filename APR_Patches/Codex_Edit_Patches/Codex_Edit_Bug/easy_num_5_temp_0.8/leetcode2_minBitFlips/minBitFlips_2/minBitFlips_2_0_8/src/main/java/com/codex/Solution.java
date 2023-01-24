package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips++;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
    
        int bitFlips = 0;
        int maxBitFlips = 0;
        int maxInclusiveFlips = 0;
        int maxFlipsPosition = 0;
        int lastMaxFlipsPosition = 0;
        
        boolean hasChangeInBetween = false;
        int index = 0;
        
        while (start > 0 || goal > 0) {
            int startBit = start & 1;
            int goalBit = goal & 1;
            
            if (startBit != goalBit) {//need to flip
                bitFlips++;
            } else {
                if (startBit == 1) {
                    maxInclusiveFlips++;
                }
                if (bitFlips > 0) {//check if the previous flips can be inclusive
                    if ((startBit == 1 && hasChangeInBetween) || (index == 0 && startBit == 0)) {
                        maxInclusiveFlips += bitFlips;
                    } else {
                        maxBitFlips = Math.max(maxBitFlips, maxInclusiveFlips);
                        maxInclusiveFlips = bitFlips;
                        lastMaxFlipsPosition = maxFlipsPosition;
                        maxFlipsPosition = index;
                    }
                    hasChangeInBetween = false;
                }
            }
            
            if (index != 0 && bitFlips > 0) hasChangeInBetween = true;
            
            index++;
            start >>= 1;
            goal >>= 1;
        }
        
        maxBitFlips = Math.max(maxBitFlips, maxInclusiveFlips);
        return maxBitFlips == 0 ? 0 : maxBitFlips + Math.min(lastMaxFlipsPosition, maxFlipsPosition);
        
    }
}