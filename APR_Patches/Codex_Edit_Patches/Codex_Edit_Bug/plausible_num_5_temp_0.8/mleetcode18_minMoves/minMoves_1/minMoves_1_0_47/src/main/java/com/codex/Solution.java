package com.codex;

import java.util.*;

public class Solution {
    public int minMoves(int target, int maxDoubles) {
        if (maxDoubles <= 1) {
            return target - maxDoubles;
        }
        if (target < 3) {
            return target;
        }
        int moves = target % 2 == 0 ? target / 2 : target - 1;
        maxDoubles = maxDoubles > target / 2 ? target / 2 : maxDoubles;
        while (target > 0) {
            int oldTarget = target;
            target = target - maxDoubles;
            maxDoubles = maxDoubles > target / 2 ? target / 2 : maxDoubles;
            while (target > 0) {
                if (target / 2 < 3) {
                    break;
                }
                if (target % 2 == 0) {
                    target /= 2;
                    maxDoubles--;
                } else {
                    break;
                }
            }
            target = target > 2 ? target : 2;
            if (oldTarget - target > maxDoubles) {
                target = oldTarget - maxDoubles;
            }
            if (target < 3) {
                break;
            }
        }
        if (maxDoubles < 1) {
            maxDoubles = 1;
        }
        while (target > 0) {
            target -= maxDoubles;
            moves++;
        }
        return moves;
    }

    
}