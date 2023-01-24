package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
        int moves = 1;
        int mostRecentMove = 1;
        while (mostRecentMove < target) {
            int nextMove = mostRecentMove * 2;
            if (maxDoubles < 1) {
                mostRecentMove++;
            } else {
                target--;
            }
        }
        return moves;
    }

    
}