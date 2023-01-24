package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
     int moves = 0;
    while (target > 0) {
        target -= (target % 2) + 1;
        moves++;
        target /= 2;
        moves++;
    }
    return moves;
}
}