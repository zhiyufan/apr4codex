package com.codex;

import java.util.*;

public class Solution {
        int moves = 0; //n
        while (target > 0) { //n
            moves++; //n
            if (target % 2 == 0 && maxDoubles > 0) { //n
                maxDoubles--; //n
                target /= 2; //n
            } else { //n
                target--; //n
            } //n
        }
        return moves;
    }

    
}