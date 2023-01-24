package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] A) {
        
        int length = A.length;
        int count = 0;
        for (int i = 0; i < length - 1; i += 2) {
            if (A[i] == A[i + 1]) {
                count++;
            }
        }
        return count;
    }


    
}