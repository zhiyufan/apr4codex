package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxSteps) {
        
        int moves = 0;
        int steps = 0;
        while (target > 0) {
            if(steps < maxSteps)
            {
                if (target % 2 == 0 && maxSteps > 0) {
                    target /= 2;
                    maxSteps--;
                } else {
                    target -= 1;
                }
            }
            else
            {
                target -= 1;
            }
            moves++;  
        }
        return moves;
    }

    
}