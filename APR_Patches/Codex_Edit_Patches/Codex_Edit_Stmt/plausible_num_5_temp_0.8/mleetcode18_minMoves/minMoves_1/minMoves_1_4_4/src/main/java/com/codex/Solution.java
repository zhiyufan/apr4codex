package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxAdds) {
        
        int moves = 0;
        while (target > 0) {
            while (target % 2 == 0 && maxAdds > 0) {
                target /= 2; maxAdds--;
            }
            target -= 1;
            moves++;
        }
        return moves;
    }


    
}