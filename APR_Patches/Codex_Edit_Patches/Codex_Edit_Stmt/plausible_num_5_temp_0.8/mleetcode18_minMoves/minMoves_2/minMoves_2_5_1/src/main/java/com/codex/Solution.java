package com.codex;

import java.util.*;

public class Solution {
public class Application {
    public static int minMoves(int target, int maxDoubles) {
        int moves = 0; //should be outside the loop
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }

}
}