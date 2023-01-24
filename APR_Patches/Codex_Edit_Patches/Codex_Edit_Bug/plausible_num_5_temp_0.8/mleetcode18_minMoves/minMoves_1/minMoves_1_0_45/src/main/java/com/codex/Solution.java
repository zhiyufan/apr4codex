package com.codex;

import java.util.*;

public class Solution {
class Solution {
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

}    
}