package com.codex;

import java.util.*;

public class Solution {
    public int minDeletionSize(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] % 2 == 0) {
                if (A[i] == A[i+1]) {
                    count++;
                }
            } else {
                if (A[i] != A[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}