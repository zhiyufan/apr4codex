package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        int moves = 0;
        if (target == 0) {
            return 0;
         }
         else if (target == 1) {
            return 1;
          }
          else {
              if (maxDoubles != 0) {
                  moves = Math.min(minMoves(target - 1, maxDoubles), minMoves(target / 2, maxDoubles - 1));
              }
              else{
                  moves = minMoves(target - 1, maxDoubles);
              }
          }
        return moves;
    }

    
}