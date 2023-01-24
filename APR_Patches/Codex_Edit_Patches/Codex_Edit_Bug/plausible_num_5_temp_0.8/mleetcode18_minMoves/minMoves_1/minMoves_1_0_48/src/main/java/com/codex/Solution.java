package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
    int moves = 0;
    while (target > 0) {
        if (target % 2 == 0 && maxDoubles > 0) {
            target /= 2;
            maxDoubles--;
        } else {
            target -= 1;
        }
        moves++;
    }
    return moves;
}

public static int minMoves(int target, int maxDoubles) {
    if (target == 0) {
        return 0;
    }
    int moves = Integer.MAX_VALUE;
    if (target % 2 == 0) {
        for (int doubles = 0; doubles <= maxDoubles; doubles++) {
            int rest = target / 2;
            int currentMoves = doubles + minMoves(rest, maxDoubles - doubles);
            if (currentMoves < moves) {
                moves = currentMoves;
            }
            moves++;
        }
        return moves;
    }

    
}