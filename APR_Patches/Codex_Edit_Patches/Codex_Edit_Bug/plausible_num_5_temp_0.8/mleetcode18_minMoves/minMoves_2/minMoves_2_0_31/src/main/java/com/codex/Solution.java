package com.codex;

import java.util.*;

public class Solution {
    
    
        

        int moves = 0;
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