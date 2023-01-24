package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return false;
            }
        }
        
        // If it doesnt return false, then all elements of A are consecutive starting from 1
        return true;
        
    }

    
}